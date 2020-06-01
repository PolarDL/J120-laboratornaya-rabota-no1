package ru.polardl.homeshopping.Models;

import java.io.Serializable;

public class OrderPosition implements Serializable {

    private Item orderPosItem;
    private int orderPosItemQuantity;
    private double orderPosItemFixedPrice;
    private double orderPosTotalPrice;

    public OrderPosition(long itemID, int orderPosItemQuantity) throws Exception {

        this.orderPosItem = ItemList.getItemListMap().get(itemID);

        if (this.orderPosItem == null) {
            throw new Exception("There is no item with provided ID in Price List file");
        }

        if (orderPosItemQuantity <= 0) {
            throw new Exception("Quantity of items should be more than 0");             //think of a better exception class to throw
        }

        if (orderPosItemQuantity > orderPosItem.getLeftover()) {
            throw new Exception("Leftover is not enough. Decrease Quantity of items in order position");             //think of a better exception class to throw
        }

        this.orderPosItemQuantity = orderPosItemQuantity;
        this.orderPosItemFixedPrice = ItemList.getItemListMap().get(itemID).getPrice(); //if provided itemID is incorrect (no such item in PriceList) it will be caught earlier
        this.orderPosTotalPrice = Math.round(orderPosItemQuantity * orderPosItemFixedPrice * 100) / 100.0;
    }


    public Item getOrderPosItem() {
        return orderPosItem;
    }

    public int getOrderPosItemQuantity() {
        return orderPosItemQuantity;
    }

    public double getOrderPosItemFixedPrice() {
        return orderPosItemFixedPrice;
    }

    public double getOrderPosTotalPrice() {
        return orderPosTotalPrice;
    }

    public void setOrderPosItemQuantity(int orderPosItemQuantity) throws Exception {
        if (orderPosItemQuantity <= 0) {
            throw new Exception("Quantity of items should be more than 0");             //think of a better exception class to throw
        }

        if (orderPosItemQuantity > orderPosItem.getLeftover()) {
            throw new Exception("Leftover is not enough. Decrease Quantity of items in order position");             //think of a better exception class to throw
        }
        this.orderPosItemQuantity = orderPosItemQuantity;
    }

    public void setOrderPosTotalPrice () {
        this.orderPosTotalPrice = Math.round(orderPosItemQuantity * orderPosItemFixedPrice * 100) / 100.0;
    }

    @Override
    public String toString() {
        return "OrderPosition{\n" +
                "       orderPosItem=" + orderPosItem +
                ", orderPosItemQuantity=" + orderPosItemQuantity +
                ", orderPosItemFixedPrice=" + orderPosItemFixedPrice +
                ", orderPosTotalPrice=" + orderPosTotalPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPosition that = (OrderPosition) o;

        return orderPosItem != null ? orderPosItem.equals(that.orderPosItem) : that.orderPosItem == null;
    }

    @Override
    public int hashCode() {
        return orderPosItem != null ? orderPosItem.hashCode() : 0;
    }
}
