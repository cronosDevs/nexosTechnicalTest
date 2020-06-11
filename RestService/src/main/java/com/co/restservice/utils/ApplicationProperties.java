package com.co.restservice.utils;

import java.io.IOException;
import java.util.Properties;

/**
 * Class Used to get environment properties
 *
 * @author Orlando Velasquez
 */
public class ApplicationProperties {

    private final Properties properties;
    private static ApplicationProperties instance;

    /**
     * Constructor to get the system variable environment
     */
    private ApplicationProperties() {
        properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Singleton patter implementation
     *
     * @return ApplicationProperties intance
     */
    public static ApplicationProperties getInstance() {
        if (instance == null) {
            instance = new ApplicationProperties();
            return instance;
        }
        return instance;
    }

    /**
     * Method used to get property
     *
     * @param propertyName propertyName
     * @return property value
     */
    public String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }
}