package ru.polardl.homeshopping;

import ru.polardl.homeshopping.IO.ItemIO;
import ru.polardl.homeshopping.IO.OrderIO;
import ru.polardl.homeshopping.Models.*;

import java.time.LocalDate;
import java.util.*;
import ru.polardl.homeshopping.GUI.MainForm;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class Application {

    public static void main(String[] args) {

//        for (HashMap.Entry<Long, Item> entry : ItemList.getItemListMap().entrySet()) {
//            System.out.println(entry);
//        }
//        System.out.println();

//        Properties defaultProperties = Config.getConfigProperties();

//        HashMap<Long, Item> itemListMap = ItemList.getItemListMap();

//        OrderList orderList = new OrderList();
//        System.out.println(orderList);

        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
        



//        Client client1 = new Client("Ivan Ivanov", "Street 5", 89211111111L);
//
//        OrderPosition orderPosition1 = null;
//        try {
//            orderPosition1 = new OrderPosition(32516028337715L, 5);
//        } catch (Exception e) {
//            System.out.println("Failed to create order position. See stack trace:");
//            e.printStackTrace();
//        }
////        System.out.println(Objects.toString(orderPositions, "Wrong input parameters while creating OrderPosition instance. " +
////                "OrderPosition instance is NULL"));
//
//        OrderPosition orderPosition2 = null;
//        try {
//            orderPosition2 = new OrderPosition(32516028337741L, 8);
//        } catch (Exception e) {
//            System.out.println("Failed to create order position. See stack trace:");
//            e.printStackTrace();
//        }
//
//        HashMap<Long, OrderPosition> orderPositionHashMap1 = new HashMap<>();
//
//        if (orderPosition1 != null) {
//            orderPositionHashMap1.put(orderPosition1.getOrderPosItem().getId(), orderPosition1);
//        }
//        if (orderPosition2 != null) {
//            orderPositionHashMap1.put(orderPosition2.getOrderPosItem().getId(), orderPosition2);
//        }
//
//        //public Order(LocalDate orderDate, Client client,               HashMap<Long, OrderPosition> orderPositionMap)
//        //public Order(LocalDate orderDate, Client client, int discount, HashMap<Long, OrderPosition> orderPositionMap)
//
//        Order order1 = new Order(LocalDate.now(), client1,15, orderPositionHashMap1);     //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        orderList.addToOrderList(order1);
//        System.out.println();
//        System.out.println(orderList);





//        Client client2 = new Client("Vova Vovin", "Square Main, 2", 89212222222L);
//
//        OrderPosition orderPosition3 = null;
//        try {
//            orderPosition3 = new OrderPosition(100002L, 4);
//        } catch (Exception e) {
//            System.out.println("Failed to create order position. See stack trace:");
//            e.printStackTrace();
//        }
//
//        HashMap<Long, OrderPosition> orderPositionHashMap2 = new HashMap<>();
//
//        if (orderPosition3 != null) {
//            orderPositionHashMap2.put(orderPosition3.getOrderPosItem().getId(), orderPosition3);
//        }
//
//        Order order2 = new Order(LocalDate.now(), client2, 10, orderPositionHashMap2); //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        orderList.addToOrderList(order2);
//        System.out.println();
//        System.out.println(orderList);




        //to empty list of orders
//        HashMap<Integer, Order> emptyOrderMap = new HashMap<>();
//        OrderIO.setOrderIO(emptyOrderMap);

//        System.out.println();
//        Order order3 = orderList.getOrderListMap().get(2);
//        System.out.println(order3);

//        orderList.deleteOrder(1);

//        orderList.changeOrderDiscount(1, 30);
//        System.out.println();
//        System.out.println(orderList);

//        orderList.changeOrderState(1, OrderState.SHIPPED);
//        System.out.println();
//        System.out.println(orderList);

//        orderList.changeOrderState(1, OrderState.INPROGRESS);
//        System.out.println();
//        System.out.println(orderList);

//        System.out.println();
//        for (HashMap.Entry<Long, Item> entry : ItemList.getItemListMap().entrySet()) {
//            System.out.println(entry);
//        }

//        Item item = null;
//        try {
//            item = new Item(99999L, "WWWWW", "ffffff", 999.99, 100);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        ItemList.putItemInItemListMap(item);
//        ItemIO.setItemIO(ItemList.getItemListMap());

//        orderList.deleteOrderPosFromOrder(1,100003L);
//        System.out.println();
//        System.out.println(orderList);

//        orderList.changeOrderPosItemQuantityInOrder(1, 100003L, 7);
//        System.out.println();
//        System.out.println(orderList);


    }
}
