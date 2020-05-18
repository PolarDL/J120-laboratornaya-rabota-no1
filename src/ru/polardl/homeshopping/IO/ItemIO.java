package ru.polardl.homeshopping.IO;

import ru.polardl.homeshopping.Models.Item;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ItemIO {

    public static HashMap<Long, Item> getItemIO() {
        HashMap<Long, Item> itemMap = new HashMap<>();

        String line;
        Scanner scanner;
        int index = 0;

        try (FileReader fileReader = new FileReader(ConfigIO.getConfigIO().getProperty("dataDirectory",
                "") + "PriceList.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((line = bufferedReader.readLine()) != null) {
                scanner = new Scanner(line);
                scanner.useDelimiter(";");

                int id = 0;
                String itemName = null;
                double price = 0;
                int leftover = 0;
                String color = null;

                while (scanner.hasNext()) {
                    String data = scanner.next();
                    if (index == 0) {
                        id = Integer.parseInt(data);
                    } else if (index == 1) {
                        itemName = data;
                    } else if (index == 2) {
                        color = data;
                    } else if (index == 3) {
                        price = Double.parseDouble(data);
                    } else if (index == 4) {
                        leftover = Integer.parseInt(data);
                    }
                    index++;
                }

                Item item = null;
                try {
                    item = new Item(id, itemName, color, price, leftover);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }


                assert item != null;
                itemMap.put(item.getId(), item);

                index = 0;
            }
        } catch (IOException e) {     //choose right exception
            System.out.println("File with prices of items is not found! Check file name and/or file path.");
        }
        return itemMap;
    }
}
