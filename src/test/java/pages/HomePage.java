package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUI;

import java.util.List;

public class HomePage extends CommonUI {
//    PageFactory.initElements() method is part of the Page Object Model (POM) design pattern in Selenium.
//    It initializes the elements of the page class (this) with the driver instance (driver).
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

//   @FindBy is going to declare and locate web elements on a web page
//    you can use CSS or XPATH to locate elements
    @FindBy(css= ".gtm-consent-close:first-child svg path")
    WebElement closeConsentBannerBtn;
    @FindBy(css= ".MuiSunrunHeader-menuItem a")
    List<WebElement> homeMenuItems;

    ////////// Implementation \\\\\\\\\\
//    This is a simple function that will click a webElement
    public void clickCloseConsentBannerBtn() {
        closeConsentBannerBtn.click();
    }

//    This function can be used to navigate to a URL,
//    for this framework, and I'm navigating to the URL from the hook class
//    public void navigateToHomePage() {
//        driver.get("https://www.sunrun.com/");
//    }

    public void verifyHomeMenuItemsAreDisplayed(List<String> expectedMenuItems) {
//        This print is just for debugging purpose
        System.out.println(homeMenuItems.size());
//        Here we are going to loop through a list of WebElementS and passing
//        one by one to a WebElement SingleMenuItem
        for (WebElement SingleMenuItem : homeMenuItems) {
//            The first assert will validate the element is being displayed
            Assert.assertTrue("* "+SingleMenuItem.getText() + " is not Displayed", SingleMenuItem.isDisplayed());//            The first assert will validate the element is being displayed
//            The second assert will validate the element text by getting the text of the element
//            and asserting it exists in the list of expected values
            Assert.assertTrue("* "+SingleMenuItem.getText()  + " is not in Menu List",expectedMenuItems.contains( SingleMenuItem.getText()));
        }
    }
}
