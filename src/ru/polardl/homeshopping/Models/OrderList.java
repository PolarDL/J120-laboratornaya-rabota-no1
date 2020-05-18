package ru.polardl.homeshopping.Models;

import ru.polardl.homeshopping.IO.OrderIO;

import java.util.HashMap;

public class OrderList {

    private HashMap<Integer, Order> orderListMap;

    public OrderList () {
        this.orderListMap = OrderIO.getOrderIO();
    }

    public HashMap<Integer, Order> getOrderListMap() {
        return orderListMap;
    }

    public void addToOrderList(Order order) {
        this.orderListMap.put(order.getOrderID(), order);
    }



    @Override
    public String toString() {
        return "OrderList{" +
                "orderListMap=" + orderListMap +
                '}';
    }
}
