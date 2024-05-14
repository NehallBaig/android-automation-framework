package com.abcCompany.core;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;


import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.*;
import utils.Utility;

import static utils.Utility.startAppiumServer;

public class DriverManager {

    public static int defaultTimeout = 10;
    public static String BuildName = "";
    public static Properties prop;
    static String apk_path = "";
    static String filePath = "";
    private static AndroidDriver driver;

    private static AppiumDriverLocalService service;

    // @BeforeSuite(alwaysRun = true) // FOR TESTNG EXECUTION
    public static void setBuildParams() {
        if (BuildName.isEmpty()) {
            filePath = System.getProperty("user.dir") + "/src/test/resources/config.properties";
            apk_path = System.getProperty("user.dir") + "/src/main/resources/apk/General-Store.apk";
            prop = Utility.readPropertiesFile(filePath);
        }
    }

    public AndroidDriver getDriver() {
        return driver;
    }

    public static AndroidDriver runTestsLocally(String testName) throws URISyntaxException, MalformedURLException {
       try {
           setBuildParams();
           UiAutomator2Options options = new UiAutomator2Options();
           //options.setDeviceName("");
           options.setApp(apk_path);

           service = startAppiumServer("127.0.0.1", 4723);
           driver = new AndroidDriver(service.getUrl(), options);
       }
       catch (Exception e){
           System.out.println("exception");
           System.out.println(e);
           return driver;
       }
        return driver;
    }

    public static void quitService() throws InterruptedException {
        driver.quit();
        service.close();
    }

}