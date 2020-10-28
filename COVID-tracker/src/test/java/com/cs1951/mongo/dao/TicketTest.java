package com.cs1951.mongo.dao;

import java.io.IOException;
import java.util.Properties;

public class TicketTest {
    private static Properties properties;

    protected static String getProperty(String propertyKey) throws IOException {

        if (properties == null) {
            TicketTest.init();
        }

        return properties.getProperty(propertyKey);
    }

    protected static void init() throws IOException {
        properties = new Properties();
        properties.load(ClassLoader.getSystemResourceAsStream("application.properties"));
    }
}