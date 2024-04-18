package com.abcCompany.core;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.io.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;
import java.util.concurrent.TimeUnit;


import org.testng.annotations.*;
import utils.Utility;

public class DriverManager {


    public static int defaultTimeout = 10;
    public static String BuildName = "";
    public Properties prop;
    String apk_path = "";
    String filePath = "";
    private AndroidDriver driver;

    @BeforeSuite(alwaysRun = true) // FOR TESTNG EXECUTION
    public void setBuildParams() {
        if (BuildName.equals("")) {
            filePath = System.getProperty("user.dir") + "/src/test/resources/config.properties";
            apk_path = System.getProperty("user.dir") + "/src/main/resources/apk/NewMotors.apk";
            prop = Utility.readPropertiesFile(filePath);
        }
    }

    public AndroidDriver getDriver() {
        return driver;
    }

    private AndroidDriver runTestsLocally(String testName) {
        return driver;
    }

}