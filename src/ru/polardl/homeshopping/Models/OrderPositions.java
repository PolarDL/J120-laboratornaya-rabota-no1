package ru.polardl.homeshopping.Models;

import java.io.Serializable;

public class OrderPositions implements Serializable {

    private Item orderPosItem;
    private int orderPosItemQuantity;
    private double orderPosItemFixedPrice;
    private double orderPosTotalPrice;

    public OrderPositions(Item orderPosItem, int orderPosItemQuantity, double orderPosItemFixedPrice) throws Exception {
        this.orderPosItem = orderPosItem;

        if (orderPosItemQuantity <= 0) {
            throw new Exception("Quantity of items should be more than 0");             //think of a better exception class to throw
        }

        this.orderPosItemQuantity = orderPosItemQuantity;
        this.orderPosItemFixedPrice = orderPosItemFixedPrice;
        this.orderPosTotalPrice = orderPosItemQuantity * orderPosItemFixedPrice;
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

    public void setOrderPosItemQuantity(int orderPosItemQuantity) {
        this.orderPosItemQuantity = orderPosItemQuantity;
    }

    @Override
    public String toString() {
        return "OrderPositions{" +
                "orderPosItem=" + orderPosItem +
                ", orderPosItemQuantity=" + orderPosItemQuantity +
                ", orderPosItemFixedPrice=" + orderPosItemFixedPrice +
                ", orderPosTotalPrice=" + orderPosTotalPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPositions that = (OrderPositions) o;

        return orderPosItem != null ? orderPosItem.equals(that.orderPosItem) : that.orderPosItem == null;
    }

    @Override
    public int hashCode() {
        return orderPosItem != null ? orderPosItem.hashCode() : 0;
    }
}
