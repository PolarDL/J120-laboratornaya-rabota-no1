package ru.polardl.homeshopping.Models;

import ru.polardl.homeshopping.IO.ConfigIO;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

public class Order implements Serializable {

    private LocalDate orderDate;
    private Client client;
    private int discount;               //not obligatory to fill in
    private OrderState orderState;
    private Set<OrderPositions> orderPositionsSet;
    private static int ordersTotalQuantity = 0;
    private int orderID;
    private double orderTotalPrice;

    public Order(LocalDate orderDate, Client client, Set<OrderPositions> orderPositionsSet) {
        this.orderDate = orderDate;
        this.client = client;
        this.orderState = OrderState.INPROGRESS;        //when new Order is created its OrderState is always INPROGRESS
        this.orderPositionsSet = orderPositionsSet;
        this.discount = 0;
        this.orderID = ++ordersTotalQuantity;
        double bufPrice = 0;
        for (OrderPositions bufPositions : orderPositionsSet) {
            bufPrice += bufPositions.getOrderPosTotalPrice();
        }
        this.orderTotalPrice = bufPrice;
    }

    public Order(LocalDate orderDate, Client client, int discount, Set<OrderPositions> orderPositionsSet) {
        this(orderDate, client, orderPositionsSet);
        this.discount = Math.min(discount, Integer.parseInt(ConfigIO.getConfigIO().getProperty("maxDiscount", "0")));
        double bufPrice = 0;
        for (OrderPositions bufPositions : orderPositionsSet) {
            bufPrice += bufPositions.getOrderPosTotalPrice();
        }
        this.orderTotalPrice = bufPrice * (100 - this.discount) / 100;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Client getClient() {
        return client;
    }

    public int getDiscount() {
        return discount;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public Set<OrderPositions> getOrderPositionsSet() {
        return orderPositionsSet;
    }

    public static int getOrdersTotalQuantity() {
        return ordersTotalQuantity;
    }

    public int getOrderID() {
        return orderID;
    }

    public double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setDiscount(int discount) {
        if (this.orderState == OrderState.INPROGRESS) {
            this.discount = Math.min(discount, Integer.parseInt(ConfigIO.getConfigIO().getProperty("maxDiscount", "0")));
        } else {
            System.out.println("Order state is not \"in progress\". Forbidden to change discount.");
        }
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void setOrderPositionsSet(Set<OrderPositions> orderPositionsSet) {
        if (this.orderState == OrderState.INPROGRESS) {
            this.orderPositionsSet = orderPositionsSet;
        } else {
            System.out.println("Order state is not \"in progress\". Forbidden to change order positions.");
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderDate=" + orderDate +
                ", client=" + client +
                ", discount=" + discount +
                ", orderState=" + orderState +
                ", orderPositionsSet=" + orderPositionsSet +
                ", orderID=" + orderID +
                ", orderTotalPrice=" + orderTotalPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return orderID == order.orderID;
    }

    @Override
    public int hashCode() {
        return orderID;
    }
}