package steps;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonUI;
import java.util.List;

public class HomeSteps extends CommonUI {
    @When("I close consent banner without accepting cookies")
    public void i_close_consent_banner_without_accepting_cookies() {
        homePageObj.clickCloseConsentBannerBtn();
    }

    @Then("Verify list of home menu items are present")
    public void verifyHomeMenuItemsPresent(List<String> expectedMenuItems) {
        homePageObj.verifyHomeMenuItemsAreDisplayed(expectedMenuItems);
    }
}
