package seleniumassignment.automation.stepdefs;

import gherkin.ast.DataTable;
import seleniumassignment.automation.config.SharedContext;
import seleniumassignment.automation.pom.actions.AbstractPage;
import seleniumassignment.automation.pom.pages.HomePage;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import java.util.List;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonSteps implements En {
    private WebDriver driver;
    private AbstractPage userActions;
    private SharedContext sharedContext;

    // Warning: Make sure the timeouts for hooks using a web driver are zero
    // NOTE: picocontainer injects SharedContext

    public CommonSteps(SharedContext sharedContext) {
        this.sharedContext = sharedContext;

        Before(new String[]{"@web"}, 0, 1, (Scenario scenario) -> {
            this.sharedContext.setUp();
        });

        Before(new String[]{"@web", "@chrome"}, 0, 1, (Scenario scenario) -> {
            driver = this.sharedContext.getDriver("chrome");
            userActions = new HomePage(driver);
        });
        Before(new String[]{"@web", "@firefox"}, 0, 1, (Scenario scenario) -> {
            driver = this.sharedContext.getDriver("firefox");
            userActions = new HomePage(driver);
        });

        Given("^launch a browser and navigate website home page$", () -> {
            userActions.navigateToHomePage();
        });
//        Then("^URL of the product details page should have \"(_p.*)\" on it$", (String text) -> {
//            assertThat(userActions.pageUrlContains(text)).isTrue();
//        });
        When("^I type product name ([^\\\"]*) on the search box$", (String product) -> {

            userActions.enterSearchPhrase(product);
        });
        When("^I click on search icon or hit enter$", () -> {
            userActions.clickOnSearchBoxIcon();
        });

        Then("^I should be redirected to the next page, title should be \"([^\"]*)\"$",(String expectedTitle) ->  {
            userActions.pageTitle();
        });

        Then("^URL of the page should have \"([^\"]*)\" on it$", (String text) -> {
            assertThat(userActions.pageUrlContains(text)).isTrue();
        });

        When("^I click on any product on the page$", () -> {
            userActions.clickFirstProduct();
        });
        When("^I click on Add to Wish List button on the page$", () -> {
            userActions.clickAddToWishListBtn();
        });
        When("^I click on Wish List link on the header$", () -> {
            userActions.clickOnWishListLink();
        });
        Then("^Product should be added in my Wish List$", () -> {
            assertThat(userActions.isProductAddedIntoWishList()).isTrue();
        });
        After(new String[]{"@web"}, (Scenario scenario) -> {
            this.sharedContext.tearDown();
        });
    }
}
