package ru.polardl.homeshopping.Models;

import ru.polardl.homeshopping.IO.ConfigIO;

import java.util.Properties;

public class Config {
    private Properties configProperties;
    private int maxDiscount;        //is it needed?
    private String filePath;        //is it needed?

    public Config() {
        configProperties = ConfigIO.readConfig();
    }

    public Properties getConfigProperties() {
        return configProperties;
    }
}
