package com.swaglabs.tech.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties properties;
    public ReadConfig() {
        File src = new File("./configuration/config.properties");

        try {
            FileInputStream fileInputStream = new FileInputStream(src);
            properties =  new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }
    }

    public String getURL() {
        return properties.getProperty("baseURL");
    }

    public String getChromePath() {
        return properties.getProperty("chromePath");
    }

    public String getFirefoxPath() {
        return properties.getProperty("firefoxPath");
    }

    public String getStandardUser() {
        return properties.getProperty("standardUser");
    }

    public String getLockedUser() {
        return properties.getProperty("lockedUser");
    }

    public String getProblemUser() {
        return properties.getProperty("problemUser");
    }

    public String getPerformanceUser() {
        return properties.getProperty("perfromanceUser");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }
}
