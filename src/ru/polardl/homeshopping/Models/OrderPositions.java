package ru.polardl.homeshopping.Models;

import java.util.Objects;

public class OrderPositions {

    private Item item;
    private int itemQuantity;
    private long itemFixedPrice;

    public OrderPositions(Item item, int itemQuantity, long itemFixedPrice) throws Exception {
        this.item = item;

        if (itemQuantity <= 0) {
            throw new Exception("Quantity of items should be more than 0");             //think of a better exception class to throw
        }
        this.itemQuantity = itemQuantity;

        this.itemFixedPrice = itemFixedPrice;
    }

    public Item getItem() {
        return item;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public long getItemFixedPrice() {
        return itemFixedPrice;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        return "OrderPositions{" +
                "item=" + item +
                ", itemQuantity=" + itemQuantity +
                ", itemFixedPrice=" + itemFixedPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPositions that = (OrderPositions) o;

        return item != null ? item.equals(that.item) : that.item == null;
    }

    @Override
    public int hashCode() {
        return item != null ? item.hashCode() : 0;
    }
}
