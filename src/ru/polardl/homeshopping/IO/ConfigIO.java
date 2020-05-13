package ru.polardl.homeshopping.IO;

import java.io.*;
import java.util.Properties;

public class ConfigIO {

    public static Properties readConfig() {                 //maybe void?
        Properties properties = new Properties();
        try (FileReader fis = new FileReader("config.properties");
             BufferedReader br = new BufferedReader(fis)) {
            properties.load(br);
        } catch (IOException e) {
            System.out.println("Path is invalid or file \"config.properties\" doesn't exist");           //modify somehow
        }
        return properties;                                  //if not void

        //maybe here properties should be transferred to config instance? and the method should be void?
    }


}
