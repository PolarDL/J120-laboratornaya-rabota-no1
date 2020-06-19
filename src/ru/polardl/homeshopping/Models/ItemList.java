package ru.polardl.homeshopping.Models;

import ru.polardl.homeshopping.IO.ItemIO;

import java.util.HashMap;

public class ItemList {

    private static ItemList instance;
    private static HashMap<Long, Item> itemListMap;

    private ItemList() {
        itemListMap = ItemIO.getItemIO();
    }

    public static HashMap<Long, Item> getItemListMap() {
        HashMap<Long, Item> bufHashMap = null;
        if (instance == null) {
            instance = new ItemList();
        }
        bufHashMap = itemListMap;
        return bufHashMap;
    }

    public static void putItemInItemListMap(Item item) {
        if (instance == null) {
            instance = new ItemList();
            itemListMap.put(item.getId(), item);
        }
        itemListMap.put(item.getId(), item);
    }
}
