package ru.polardl.homeshopping.Models;

import ru.polardl.homeshopping.IO.ConfigIO;

import java.util.Properties;

public class Config {

    private static Config instance;
    private static Properties configProperties;

    private Config() {
        configProperties = ConfigIO.getConfigIO();
    }

    public static Properties getConfigProperties() {
        if (instance == null) {
            instance = new Config();
            return configProperties;
        }
        return configProperties;
    }
}
