package ru.polardl.homeshopping.Models;

import ru.polardl.homeshopping.IO.ConfigIO;

import java.util.Properties;

public class Config {       //to be deleted as an excessive class?

    private Properties configProperties;

    public Config() {
        configProperties = ConfigIO.getConfigIO();
    }

    public Properties getConfigProperties() {
        return configProperties;
    }
}
