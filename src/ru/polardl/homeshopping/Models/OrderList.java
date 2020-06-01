package ru.polardl.homeshopping.Models;

import ru.polardl.homeshopping.IO.ItemIO;
import ru.polardl.homeshopping.IO.OrderIO;

import java.io.Serializable;
import java.util.HashMap;

public class OrderList implements Serializable {

    private HashMap<Integer, Order> orderListMap;
    private static int lastOrderID;

    public OrderList () {
        this.orderListMap = OrderIO.getOrderIO();
        int buf = 0;
        for (HashMap.Entry<Integer, Order> entry : this.orderListMap.entrySet()) {
            if (entry.getKey() > buf) {
                buf = entry.getKey();
            }
        }
        lastOrderID = buf;
    }

    public HashMap<Integer, Order> getOrderListMap() {
        return orderListMap;
    }

    //a method to add Order to order List
    public void addToOrderList(Order order) {
        this.orderListMap.put(order.getOrderID(), order);
        OrderIO.setOrderIO(this.orderListMap);
    }

    //a method to delete Order from order List
    public void deleteOrder(int orderID) {
        if (this.orderListMap.get(orderID).getOrderState().equals(OrderState.INPROGRESS)) {
            this.orderListMap.remove(orderID);
            OrderIO.setOrderIO(this.orderListMap);
        } else {
            System.out.println("Order state is not \"in progress\". Forbidden to delete order from order list.");
        }
    }

    //a method to change Order in orderList. Change Order Discount
    public void changeOrderDiscount(int orderID, int newDiscount) {
        Order bufOrder = this.orderListMap.remove(orderID);
        bufOrder.setDiscount(newDiscount);
        this.addToOrderList(bufOrder);
    }

    //a method to change Order in orderList. Change Order State
    public void changeOrderState(int orderID, OrderState orderState) {
        Order bufOrder = this.orderListMap.remove(orderID);
        bufOrder.setOrderState(orderState);
        this.addToOrderList(bufOrder);

        if (this.orderListMap.get(orderID).getOrderState().equals(OrderState.SHIPPED)) {
            for (HashMap.Entry<Long, OrderPosition> entry : this.orderListMap.get(orderID).getOrderPositionMap().entrySet()) {
                int leftoverBeforeShipping = entry.getValue().getOrderPosItem().getLeftover();
                int itemsToBeShipped = entry.getValue().getOrderPosItemQuantity();
                entry.getValue().getOrderPosItem().setLeftover(leftoverBeforeShipping - itemsToBeShipped);
                ItemList.putItemInItemListMap(entry.getValue().getOrderPosItem());
            }
            //write leftover to a file
            ItemIO.setItemIO(ItemList.getItemListMap());

            //rewrite order to order list when shipped to update info about leftover in order list
            Order bufOrder1 = this.orderListMap.remove(orderID);
            bufOrder1.setOrderState(orderState);
            this.addToOrderList(bufOrder1);
        }
    }

    //a method to change Order in orderList. Delete order position (item) from order
    public void deleteOrderPosFromOrder(int orderID, long orderPosItemID) {
        if (this.orderListMap.get(orderID).getOrderState().equals(OrderState.INPROGRESS)) {
            double beforeOrderTotalPrice = this.orderListMap.get(orderID).getOrderTotalPrice();
            double bufOrderPosPrice = this.orderListMap.get(orderID).getOrderPositionMap().get(orderPosItemID).getOrderPosTotalPrice();
            int discount = this.orderListMap.get(orderID).getDiscount();

            this.orderListMap.get(orderID).getOrderPositionMap().remove(orderPosItemID);

            double newOrderTotalPrice = Math.round((beforeOrderTotalPrice - bufOrderPosPrice * (100 - discount) / 100) * 100) / 100.0;
            this.orderListMap.get(orderID).setOrderTotalPrice(newOrderTotalPrice);

            OrderIO.setOrderIO(this.orderListMap);
        } else {
            System.out.println("Order state is not \"in progress\". Forbidden to delete order position from order.");
        }
    }

    //a method to change order in orderList. Change quantity of certain items in order
    public void changeOrderPosItemQuantityInOrder(int orderID, long orderPosItemID, int orderPosItemQuantity) {
        if (this.orderListMap.get(orderID).getOrderState().equals(OrderState.INPROGRESS)) {

            double beforeOrderTotalPrice = this.orderListMap.get(orderID).getOrderTotalPrice();
            int discount = this.orderListMap.get(orderID).getDiscount();
            OrderPosition bufOrderPosition = this.orderListMap.get(orderID).getOrderPositionMap().remove(orderPosItemID);
            double beforeOrderPosPrice = bufOrderPosition.getOrderPosTotalPrice();

            try {
                bufOrderPosition.setOrderPosItemQuantity(orderPosItemQuantity);
            } catch (Exception e) {
                e.printStackTrace();
            }

            bufOrderPosition.setOrderPosTotalPrice();

            this.orderListMap.get(orderID).getOrderPositionMap().put(orderPosItemID, bufOrderPosition);

            double newOrderTotalPrice = beforeOrderTotalPrice - beforeOrderPosPrice * (100 - discount) / 100.0;
            newOrderTotalPrice += bufOrderPosition.getOrderPosTotalPrice() * (100 - discount) / 100.0;
            newOrderTotalPrice = Math.round(newOrderTotalPrice * 100) / 100.0;

            this.orderListMap.get(orderID).setOrderTotalPrice(newOrderTotalPrice);

            OrderIO.setOrderIO(this.orderListMap);
        } else {
            System.out.println("Order state is not \"in progress\". Forbidden to change quantity of certain items (aka order position) in order.");
        }
    }


    public static int getLastOrderID() {
        return lastOrderID;
    }

    public static void setLastOrderID(int lastOrderID) {
        OrderList.lastOrderID = lastOrderID;
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "orderListMap=" + orderListMap +
                '}';
    }
}
