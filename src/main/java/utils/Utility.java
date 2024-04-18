package utils;


import java.io.*;
import java.util.*;

public class Utility {

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

