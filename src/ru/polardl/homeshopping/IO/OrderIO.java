package ru.polardl.homeshopping.IO;

import ru.polardl.homeshopping.Models.Config;
import ru.polardl.homeshopping.Models.Order;

import java.io.*;
import java.util.HashMap;

public class OrderIO {

    public static HashMap<Integer, Order> getOrderIO() {
        HashMap<Integer, Order> orderHashMap = new HashMap<>();

        try (FileInputStream fileInputStream = new FileInputStream(Config.getConfigProperties().getProperty("dataDirectory",
                "") + "ListOfOrders.dat");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            orderHashMap = (HashMap<Integer, Order>) objectInputStream.readObject();

        } catch (Exception e) {         //choose right exception
            System.out.println("File \"ListOfOrders.dat\" with list of orders is not found! Check file name and/or file path. " +
                    "Will be created a new empty file \"ListOfOrders.dat\" in root directory.");
//            e.printStackTrace();

            HashMap<Integer, Order> emptyOrderMap = new HashMap<>();
            OrderIO.setOrderIO(emptyOrderMap);
        }
        return orderHashMap;
    }

    public static void setOrderIO(HashMap<Integer, Order> orderHashMap) {

        try (FileOutputStream fileOutputStream = new FileOutputStream(Config.getConfigProperties().getProperty("dataDirectory",
                "") + "ListOfOrders.dat");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(orderHashMap);

        } catch (IOException e) {     //choose right exception
            System.out.println("Failed to save list of orders to disk");
        }
    }
}
