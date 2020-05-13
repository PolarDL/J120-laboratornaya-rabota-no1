package ru.polardl.homeshopping;

import ru.polardl.homeshopping.IO.ConfigIO;
import ru.polardl.homeshopping.Models.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Properties;

public class Application {

    public static void main(String[] args) {

//        Client client = new Client("Ivan Ivanov", "Street 5", 89219279284L);
//        System.out.println(client);

//        Item item = null;
//        try {
//            item = new Item(100001, "Knife", 20499, 7);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(Objects.toString(item, "Wrong input parameters while creating Item instance. " +
//                "Item instance is NULL"));

//        Item item2 = null;
//        try {
//            item2 = new Item(100002, "Knife2", 14999, 15, "pink");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(Objects.toString(item2, "Wrong input parameters while creating Item instance. " +
//                "Item instance is NULL"));

//        assert item != null;
//        System.out.println(item.equals(item2));

//        OrderPositions orderPositions = null;
//        try {
//            orderPositions = new OrderPositions(item, 2, item.getPriceInCents());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(Objects.toString(orderPositions, "Wrong input parameters while creating OrderPositions instance. " +
//                "OrderPositions instance is NULL"));

//        OrderPositions orderPositions2 = null;
//        try {
//            orderPositions2 = new OrderPositions(item, 4, item.getPriceInCents());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(Objects.toString(orderPositions2, "Wrong input parameters while creating OrderPositions instance. " +
//                "OrderPositions instance is NULL"));

//        assert orderPositions != null;
//        System.out.println(orderPositions.equals(orderPositions2));


        //public Order(LocalDate orderDate, Client client, int discount, OrderPositions orderPositions)
//        Order order = new Order(LocalDate.now(), client, 20, orderPositions);
//        System.out.println(order.getOrderState());


//        Properties properties = new Properties();
//        try (FileReader fis = new FileReader("config.properties");
//             BufferedReader br = new BufferedReader(fis)) {
//            properties.load(br);
//        } catch (IOException e) {
//            System.out.println("Path is invalid or file \"config.properties\" doesn't exist");  //modify somehow
//        }


//        Properties properties = ConfigIO.readConfig();
//        int maxDiscount = Integer.parseInt(properties.getProperty("maxDiscount"));
//        System.out.println(maxDiscount);
//        String path = properties.getProperty("dataDirectory");
//        System.out.println(path);


//        Config config = new Config();
//        String path = config.getConfigProperties().getProperty("dataDirectory");
//        System.out.println(path);
    }
}
