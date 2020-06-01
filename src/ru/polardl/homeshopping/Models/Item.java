package ru.polardl.homeshopping.Models;

import java.io.Serializable;

public class Item implements Serializable {

    private long id;
    private String itemName;
    private String color;           //not obligatory to fill in
    private double price;
    private int leftover;

    public Item(long id, String itemName, String color, double price, int leftover) throws Exception {
        this.id = id;
        this.itemName = itemName;

        if (!color.equals("")) {
            this.color = color;
        } else {
            this.color = "n/a";
        }

        if (price <= 0) {
            throw new Exception("Price should be more than 0");             //think of a better exception class to throw
        }
        this.price = price;

        if (leftover < 0) {
            throw new Exception("Leftover can't be less than 0");           //think of a better exception class to throw
        }
        this.leftover = leftover;

    }

    public long getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getLeftover() {
        return leftover;
    }

    public void setLeftover(int leftover) {
        if (leftover >= 0) {
            this.leftover = leftover;
        } else {
            System.out.println("Leftover can't be less than zero");
        }
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", leftover=" + leftover +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        return id == item.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}