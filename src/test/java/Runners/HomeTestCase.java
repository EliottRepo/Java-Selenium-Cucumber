package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/home.feature",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class HomeTestCase {
}
