package ru.polardl.homeshopping.IO;

import ru.polardl.homeshopping.Models.Config;
import ru.polardl.homeshopping.Models.Item;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class ItemIO {

    public static HashMap<Long, Item> getItemIO() {
        HashMap<Long, Item> itemMap = new HashMap<>();

        String line;
        Scanner scanner;
        int index = 0;

        try (FileReader fileReader = new FileReader( Config.getConfigProperties().getProperty("dataDirectory",
                     "") + "PriceList.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((line = bufferedReader.readLine()) != null) {
                scanner = new Scanner(line);
                scanner.useDelimiter(";");

                long id = 0;
                String itemName = null;
                double price = 0;
                int leftover = 0;
                String color = null;

                while (scanner.hasNext()) {
                    String data = scanner.next();
                    if (index == 0) {
                        id = Long.parseLong(data);
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

    public static void setItemIO(HashMap<Long, Item> itemListMap) {
        StringBuilder stringBuilder = new StringBuilder();

        for (HashMap.Entry<Long, Item> entry : itemListMap.entrySet()) {
            stringBuilder.append(entry.getValue().getId());
            stringBuilder.append(";");
            stringBuilder.append(entry.getValue().getItemName());
            stringBuilder.append(";");
            if (!entry.getValue().getColor().equals("n/a")) {
                stringBuilder.append(entry.getValue().getColor());
            }
            stringBuilder.append(";");
            stringBuilder.append(entry.getValue().getPrice());
            stringBuilder.append(";");
            stringBuilder.append(entry.getValue().getLeftover());
            stringBuilder.append("\n");
        }

        try (FileWriter fileWriter = new FileWriter("PriceList.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(stringBuilder.toString());
        } catch (IOException e) {
            System.out.println("Failed to write Price List to a file");
            e.printStackTrace();
        }
    }
}
