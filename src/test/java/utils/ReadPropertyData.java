package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyData {

    public static Properties getProperties(String filePath) {

        // Create a Properties class object to access the property file
        Properties prop = new Properties();

        // create FileInputStream object
        FileInputStream file = null;

        try {
            // pass the file path
            file = new FileInputStream(filePath);

            // load the properties file
            prop.load(file);

        } catch (Exception e) {
            System.out.println("Property File does not exists, check the path " + filePath);
            e.printStackTrace();
        } finally {

            try {
                file.close();
            } catch (Exception e2) {
                System.out.println("Property File does not exists, check the path " + filePath);
            }
        }
        return prop;
    }
}
