package utils;

import org.openqa.selenium.WebDriver;

import java.util.Properties;
import pages.HomePage;
public class Constants {


    public static WebDriver driver;
    public static Properties prop;
    public static String configFilePath = "./src/test/resources/configs/config.properties";

///////////  Instantiating Pages  \\\\\\\\\\\
    public static HomePage homePageObj;

}
