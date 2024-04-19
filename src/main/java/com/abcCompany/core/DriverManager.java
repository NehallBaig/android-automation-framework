package com.abcCompany.core;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;


import org.testng.annotations.*;
import utils.Utility;

public class DriverManager {


    public static int defaultTimeout = 10;
    public static String BuildName = "";
    public static Properties prop;
    static String apk_path = "";
    static String filePath = "";
    private static AndroidDriver driver;

    // @BeforeSuite(alwaysRun = true) // FOR TESTNG EXECUTION
    public static void setBuildParams() {
        if (BuildName.isEmpty()) {
            System.out.println("pass");
            filePath = System.getProperty("user.dir") + "/src/test/resources/config.properties";
            apk_path = System.getProperty("user.dir") + "/src/main/resources/apk/General-Store.apk";
            prop = Utility.readPropertiesFile(filePath);
        }
    }

    public AndroidDriver getDriver() {
        return driver;
    }

    public static AndroidDriver runTestsLocally(String testName) throws URISyntaxException, MalformedURLException {
        setBuildParams();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName(prop.getProperty("androidDeviceName"));
        options.setApp(apk_path);
        driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
        return driver;
    }

}