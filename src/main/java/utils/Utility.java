package utils;


import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.*;
import java.util.*;

public class Utility {


    public static AppiumDriverLocalService startAppiumServer(String ipAddress, int port) {
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.withIPAddress(ipAddress);
        builder.usingPort(port);

        AppiumDriverLocalService service = AppiumDriverLocalService.buildService(builder);
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