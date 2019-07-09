package seleniumassignment.automation.stepdefs;

import seleniumassignment.automation.SharedContext;
import seleniumassignment.automation.pages.AbstractPage;
import seleniumassignment.automation.pages.HomePage;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class MakeSearch implements En {
    private WebDriver driver;
    private AbstractPage userActions;
    private SharedContext sharedContext;

    // Warning: Make sure the timeouts for hooks using a web driver are zero

    // NOTE: picocontainer injects SharedContext
    public MakeSearch(SharedContext sharedContext) {
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
        When("^the search phrase \"([^\"]*)\" is entered$", (String text) -> {
            userActions.enterSearchPhrase(text);
        });
        Then("^URL of the page should have \"([^\"]*)\" on it$", (String text) -> {
            assertThat(userActions.pageTitleContains(text)).isTrue();
        });
        Then("^URL of the product details page should have \"(_p.*)\" on it$", (String text) -> {
            assertThat(userActions.pageTitleContains(text)).isTrue();
        });
        When("^i click on any product on the page$", () -> {
            userActions.clickFirstProduct();
        });
        When("^i click on Add to Wish List button on the page$", () -> {
            userActions.clickAddToWishListBtn();
        });
        When("^i click on Wish List link on the header$", () -> {
            userActions.clickOnWishListLink();
        });
        Then("^product should be added in my Wish List$", () -> {
            assertThat(userActions.isProductAddedIntoWishList()).isTrue();
        });
        After(new String[]{"@web"}, (Scenario scenario) -> {
            this.sharedContext.tearDown();
        });
    }
}
