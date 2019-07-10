package seleniumassignment.automation.config;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "junit:target/cucumber.xml"},
        features = "src/test/resources/seleniumassignment/automation",
        glue = {"seleniumassignment.automation.stepdefs"})
public class RunCucumberTest {
}