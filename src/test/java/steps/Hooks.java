package steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import utils.CommonUI;
import utils.ReadPropertyData;

public class Hooks extends CommonUI {

    @Before
    public void setup(Scenario scenario) {
        prop = ReadPropertyData.getProperties(configFilePath);
        openBrowser(prop.getProperty("browser"));
        navigate(prop.getProperty("url"));
        initializeClassObj();
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Finished Executing Test Scenario: [" + scenario.getName() + "]");
        if (driver != null) {
            driver.quit();
        }    }


    public void initializeClassObj() {
        homePageObj = new HomePage();
    }
}
