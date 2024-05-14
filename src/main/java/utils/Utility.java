package utils;


import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.*;
import java.util.*;

public class Utility {

    private static AppiumDriverLocalService service;

    public static AppiumDriverLocalService startAppiumServer(String ipAddress, int port) {
        service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
                .withIPAddress(ipAddress).usingPort(port).build();
        service.start();
        return service;
    }

    public static Properties readPropertiesFile(String filepath) {
        Properties prop = new Properties();
        InputStream input = null;
        File configFile = new File(filepath);
        try {
            input = new FileInputStream(configFile.getAbsolutePath());
            prop.load(input);
        } catch (Exception e) {
            System.out.println("ERROR: Unable to read config file");
        }
        return prop;
    }

}