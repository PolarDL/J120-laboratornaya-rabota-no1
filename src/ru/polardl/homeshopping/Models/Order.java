package ru.polardl.homeshopping.Models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order implements Serializable {

    private LocalDate orderDate;
    private Client client;
    private int discount;               //not obligatory to fill in
    private OrderState orderState;
    private HashMap<Long, OrderPosition> orderPositionMap;
    private int orderID;
    private double orderTotalPrice;

    public Order(LocalDate orderDate, Client client, HashMap<Long, OrderPosition> orderPositionMap) {
        this.orderDate = orderDate;
        this.client = client;
        this.orderState = OrderState.INPROGRESS;        //when new Order is created its OrderState is always INPROGRESS
        this.orderPositionMap = orderPositionMap;
        this.discount = 0;

        this.orderID = OrderList.getLastOrderID() + 1;
        OrderList.setLastOrderID(this.orderID);

        double bufPrice = 0;
        for (Map.Entry<Long, OrderPosition> entry : orderPositionMap.entrySet()) {
            bufPrice += entry.getValue().getOrderPosTotalPrice();
        }
        this.orderTotalPrice = Math.round(bufPrice * 100) / 100.0;
    }

    public Order(LocalDate orderDate, Client client, int discount, HashMap<Long, OrderPosition> orderPositionMap) {
        this(orderDate, client, orderPositionMap);
        this.discount = Math.min(discount, Integer.parseInt(Config.getConfigProperties().getProperty("maxDiscount", "0")));

        double bufPrice = 0;
        for (Map.Entry<Long, OrderPosition> entry : orderPositionMap.entrySet()) {
            bufPrice += entry.getValue().getOrderPosTotalPrice();
        }
        this.orderTotalPrice = Math.round(bufPrice * (100 - this.discount)) / 100.0;
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

    public HashMap<Long, OrderPosition> getOrderPositionMap() {
        return orderPositionMap;
    }

    public int getOrderID() {
        return orderID;
    }

    public double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setDiscount(int discount) {
        double bufOrderTotalPrice = this.orderTotalPrice / (100 - this.getDiscount()) * 100.0;

        if (this.orderState == OrderState.INPROGRESS) {
            this.discount = Math.min(discount, Integer.parseInt(Config.getConfigProperties().getProperty("maxDiscount", "0")));
        } else {
            System.out.println("Order state is not \"in progress\". Forbidden to change discount.");
        }

        this.orderTotalPrice = Math.round(bufOrderTotalPrice * (100 - this.discount)) / 100.0;
    }

    public void setOrderState(OrderState orderState) {
        if (this.orderState == OrderState.INPROGRESS) {
            this.orderState = orderState;
        } else {
            System.out.println("Order state is not \"in progress\". Forbidden to change order state.");
        }
    }

    public void setOrderPositionMap(HashMap<Long, OrderPosition> orderPositionMap) {
        if (this.orderState == OrderState.INPROGRESS) {
            this.orderPositionMap = orderPositionMap;
        } else {
            System.out.println("Order state is not \"in progress\". Forbidden to change order positions.");
        }
    }

    public void setOrderTotalPrice(double orderTotalPrice) {
        if (this.orderState == OrderState.INPROGRESS) {
            this.orderTotalPrice = orderTotalPrice;
        } else {
            System.out.println("Order state is not \"in progress\". Forbidden to change order total price.");
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "\n   orderDate=" + orderDate +
                ", \n   client=" + client +
                ", \n   discount=" + discount +
                ", \n   orderState=" + orderState +
                ", \n   orderPositionMap=" + orderPositionMap +
                ", \n   orderID=" + orderID +
                ", \n   orderTotalPrice=" + orderTotalPrice +
                '}' +"\n";
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