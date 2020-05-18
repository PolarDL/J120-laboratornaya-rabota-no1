package ru.polardl.homeshopping.IO;

import ru.polardl.homeshopping.Models.Order;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

public class OrderIO {

    public static HashMap<Integer, Order> getOrderIO() {
        HashMap<Integer, Order> orderHashMap = new HashMap<>();

        //maybe I should get data directory path using Config instance (and not ConfigIO class)
        try (FileInputStream fileInputStream = new FileInputStream(ConfigIO.getConfigIO().getProperty("dataDirectory",
                "") + "ListOfOrders.dat");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            orderHashMap = (HashMap<Integer, Order>) objectInputStream.readObject();

        } catch (Exception e) {         //choose right exception
            System.out.println("File \"ListOfOrders.dat\" with list of orders is not found! Check file name and/or file path. " +
                    "Will be created a new empty file \"ListOfOrders.dat\" in root directory.");
            e.printStackTrace();

            try {
                FileOutputStream fileOutputStream = new FileOutputStream("ListOfOrders.dat");
                fileOutputStream.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                System.out.println("FileNotFoundException: Failed to create new empty file \"ListOfOrders.dat\" in root directory.");
            } catch (IOException ex) {
                ex.printStackTrace();
                System.out.println("IOException: Failed to create new empty file \"ListOfOrders.dat\" in root directory.");
            }
        }
        return orderHashMap;
    }

    public static void setOrderIO(HashMap<Integer, Order> orderHashMap) {

        //maybe I should get data directory path using Config instance (and not ConfigIO class)
        try (FileOutputStream fileOutputStream = new FileOutputStream(ConfigIO.getConfigIO().getProperty("dataDirectory",
                "") + "ListOfOrders.dat");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(orderHashMap);

        } catch (IOException e) {     //choose right exception
            System.out.println("Failed to save list of orders to disk");
        }
    }
}
