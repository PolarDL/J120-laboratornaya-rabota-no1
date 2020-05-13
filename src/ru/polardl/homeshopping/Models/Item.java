package ru.polardl.homeshopping.Models;

import javax.crypto.spec.PSource;

public class Item {

    private int id;
    private String itemName;
    private String color;           //not obligatory to fill in
    private long priceInCents;
    private int leftover;

    public Item(int id, String itemName, long priceInCents, int leftover) throws Exception {
        this.id = id;
        this.itemName = itemName;

//        if (priceInCents <= 0) {
//            throw new IllegalArgumentException("Price should be more than 0");
//        }
//        this.priceInCents = priceInCents;

        if (priceInCents <= 0) {
            throw new Exception("Price should be more than 0");             //think of a better exception class to throw
        }
        this.priceInCents = priceInCents;

//        if (leftover < 0) {
//            throw new IllegalArgumentException("Leftover can't be less than 0");
//        }
//        this.leftover = leftover;

        if (leftover < 0) {
            throw new Exception("Leftover can't be less than 0");           //think of a better exception class to throw
        }
        this.leftover = leftover;

        this.color = "n/a";
    }

    public Item(int id, String itemName, long priceInCents, int leftover, String color) throws Exception {
        this(id, itemName, priceInCents, leftover);
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public String getColor() {
        return color;
    }

    public long getPriceInCents() {
        return priceInCents;
    }

    public int getLeftover() {
        return leftover;
    }

    //do I need setters for Item?


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", color='" + color + '\'' +
                ", priceInCents=" + priceInCents +
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
        return id;
    }
}