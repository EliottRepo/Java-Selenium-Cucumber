package utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUI extends Constants{
    public static void openBrowser(String browser) {
        try {
            switch (browser.toLowerCase()) {

                case "firefox":
                case "ie":
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
        } catch (Exception e) {
            System.out.println("Browser has [" + browser + "] value. Make sure to pass [chrome/ie/firefox]");
            e.printStackTrace();
        }
    }
    public static void navigate(String url) {

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get(url);
        } catch (Exception e) {
            System.out.println("Check the url [" + url + "], make sure it contains correct format");
            e.printStackTrace();
        }

    }
}
