package ru.polardl.homeshopping.IO;

import java.io.*;
import java.util.Properties;

public class ConfigIO {

    public static Properties getConfigIO() {                 //maybe void?
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader("config.properties");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            properties.load(bufferedReader);
        } catch (IOException e) {
            System.out.println("Path is invalid or file \"config.properties\" doesn't exist.");
        }
        return properties;                                  //if not void

        //maybe here properties should be transferred to config instance? and the method should be void?
    }
}
