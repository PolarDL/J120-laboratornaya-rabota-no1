package ru.polardl.homeshopping.Models;

import java.time.LocalDate;
import java.util.Set;

public class Order {

    private LocalDate orderDate;
    private Client client;
    private int discount;               //not obligatory to fill in
    private OrderState orderState;
    private Set<OrderPositions> orderPositionsSet;

    public Order(LocalDate orderDate, Client client, Set<OrderPositions> orderPositionsSet) {
        this.orderDate = orderDate;
        this.client = client;
        this.orderState = OrderState.INPROGRESS;        //when new Order is created its OrderState is always INPROGRESS
        this.orderPositionsSet = orderPositionsSet;
        this.discount = 0;
    }

    public Order(LocalDate orderDate, Client client, int discount, Set<OrderPositions> orderPositionsSet) {
        this(orderDate, client, orderPositionsSet);
        this.discount = discount;   //Discount must be checked somehow to be less or equal to max discount from properties file!!!
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

    public void setDiscount(int discount) {
        this.discount = discount;    //Discount must be checked somehow to be less or equal to max discount from properties file!!!
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void setOrderPositionsSet(Set<OrderPositions> orderPositionsSet) {
        this.orderPositionsSet = orderPositionsSet;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderDate=" + orderDate +
                ", client=" + client +
                ", discount=" + discount +
                ", orderState=" + orderState +
                ", orderPositionsSet=" + orderPositionsSet +
                '}';
    }
}