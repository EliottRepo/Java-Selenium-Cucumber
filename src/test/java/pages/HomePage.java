package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUI;

import java.util.List;

public class HomePage extends CommonUI {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css= ".gtm-consent-close:first-child svg path")
    WebElement closeConsentBannerBtn;
    @FindBy(css= ".MuiSunrunHeader-menuItem a")
    List<WebElement> homeMenuItems;
    public void clickCloseConsentBannerBtn() {
        closeConsentBannerBtn.click();
    }

    public void navigateToHomePage() {
        driver.get("https://www.sunrun.com/");
    }

    public void verifyHomeMenuItemsAreDisplayed(List<String> expectedMenuItems) {
        System.out.println(homeMenuItems.size());
        for (WebElement SingleMenuItem : homeMenuItems) {

            Assert.assertTrue("* "+SingleMenuItem.getText() + " is not Displayed", SingleMenuItem.isDisplayed());
            Assert.assertTrue("* "+SingleMenuItem.getText()  + " is not in Menu List",expectedMenuItems.contains( SingleMenuItem.getText()));
        }
    }
}
