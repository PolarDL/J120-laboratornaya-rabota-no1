package ru.polardl.homeshopping.Models;

import ru.polardl.homeshopping.IO.ItemIO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ItemList {

    private HashMap<Long, Item> itemListMap;

    public ItemList() {
        this.itemListMap = ItemIO.getItemIO();
    }

    public HashMap<Long, Item> getItemListMap() {
        return itemListMap;
    }
}
