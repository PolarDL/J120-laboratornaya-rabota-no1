package ru.polardl.homeshopping;

import ru.polardl.homeshopping.IO.ConfigIO;
import ru.polardl.homeshopping.IO.ItemIO;
import ru.polardl.homeshopping.IO.OrderIO;
import ru.polardl.homeshopping.Models.*;

import java.io.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

//        Properties properties = ConfigIO.getConfigIO();
//        int maxDiscount = Integer.parseInt(properties.getProperty("maxDiscount"));
//        System.out.println(maxDiscount);
//        String path = properties.getProperty("dataDirectory");
//        System.out.println(path);


//        Config config = new Config();
//        String path = config.getConfigProperties().getProperty("dataDirectory");
//        System.out.println(path);

        Client client = new Client("Ivan Ivanov", "Street 5", 89219279284L);
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
//            item2 = new Item(100002, "Knife", "pink" , 14999, 15);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(Objects.toString(item2, "Wrong input parameters while creating Item instance. " +
//                "Item instance is NULL"));

//        assert item != null;
//        System.out.println(item.equals(item2));

//        OrderPositions orderPositions = null;
//        try {
//            assert item != null;
//            orderPositions = new OrderPositions(item, 2, item.getPrice());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(Objects.toString(orderPositions, "Wrong input parameters while creating OrderPositions instance. " +
//                "OrderPositions instance is NULL"));

//        OrderPositions orderPositions2 = null;
//        try {
//            assert item2 != null;
//            orderPositions2 = new OrderPositions(item2, 4, item2.getPrice());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(Objects.toString(orderPositions2, "Wrong input parameters while creating OrderPositions instance. " +
//                "OrderPositions instance is NULL"));

//        assert orderPositions != null;
//        System.out.println(orderPositions.equals(orderPositions2));

//        Set<OrderPositions> orderPositionsSet = new HashSet<>();
//        orderPositionsSet.add(orderPositions);
//        orderPositionsSet.add(orderPositions2);
//        long sumOfOrderPositionsSetPrices = 0;
//        for (OrderPositions buf : orderPositionsSet) {
//            sumOfOrderPositionsSetPrices += buf.getOrderPosTotalPrice();
//        }
//        System.out.println(sumOfOrderPositionsSetPrices);


//        Properties properties = new Properties();
//        try (FileReader fis = new FileReader("config.properties");
//             BufferedReader br = new BufferedReader(fis)) {
//            properties.load(br);
//        } catch (IOException e) {
//            System.out.println("Path is invalid or file \"config.properties\" doesn't exist");  //modify somehow
//        }


        ItemList itemList = new ItemList();
//        HashMap<Long, Item> itemHashMap = itemList.getItemListMap();
//        for (HashMap.Entry<Long, Item> buf : itemHashMap.entrySet()) {
//            System.out.println(buf.getKey() + " " + buf.getValue());
//        }

//        System.out.println(itemList.getItemListMap().get(100002L));
        Item item1 = itemList.getItemListMap().get(100001L);
        Item item2 = itemList.getItemListMap().get(100003L);
//        System.out.println(item);

        OrderPositions orderPositions1 = null;
        try {
            orderPositions1 = new OrderPositions(item1, 2, item1.getPrice());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        System.out.println(Objects.toString(orderPositions, "Wrong input parameters while creating OrderPositions instance. " +
////                "OrderPositions instance is NULL"));

        OrderPositions orderPositions2 = null;
        try {
            orderPositions2 = new OrderPositions(itemList.getItemListMap().get(100003L), 5,
                    itemList.getItemListMap().get(100003L).getPrice());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Set<OrderPositions> orderPositionsSet = new HashSet<>();
        orderPositionsSet.add(orderPositions1);
        orderPositionsSet.add(orderPositions2);

//        OrderList orderList = new OrderList();
//        System.out.println(orderList.getOrderListMap());


        //public Order(LocalDate orderDate, Client client, int discount, OrderPositions orderPositions)
        Order order = new Order(LocalDate.now(), client, 15, orderPositionsSet);

//        System.out.println(order.getOrderState());
//        System.out.println(order.getDiscount());
//        order.setDiscount(30);
//        System.out.println(order.getDiscount());
//        order.setOrderState(OrderState.SHIPPED);
//        System.out.println(order.getOrderState());
//        order.setDiscount(35);
//        System.out.println(order.getDiscount());
//        System.out.println(order.getOrderID());
//        System.out.println(Order.getOrdersTotalQuantity());
//        System.out.println(order.getOrderTotalPrice());

//        orderList.addToOrderList(order);
//        System.out.println(orderList.getOrderListMap());



        HashMap<Integer, Order> orderHashMap = new HashMap<>();
        orderHashMap.put(order.getOrderID(), order);
//        System.out.println(orderHashMap);

        OrderIO.setOrderIO(orderHashMap);





//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("ListOfOrders.dat");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//            objectOutputStream.writeObject(orderHashMap);
//
//            objectOutputStream.close();
//            fileOutputStream.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("IOE");
//        }



//        HashMap<Integer, Order> orderHashMap2 = new HashMap<>();
//        try {
//            FileInputStream fileInputStream = new FileInputStream("ListOfOrders.dat");
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//            orderHashMap2 = (HashMap<Integer, Order>) objectInputStream.readObject();
//
//            objectInputStream.close();
//            fileInputStream.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println(orderHashMap2);

    }
}
