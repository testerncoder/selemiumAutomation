package seleniumassignment.automation.stepdefs;

import seleniumassignment.automation.config.SharedContext;
import seleniumassignment.automation.pom.actions.AbstractPage;
import seleniumassignment.automation.pom.pages.HomePage;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import seleniumassignment.automation.pom.pages.MyWishListPage;
import seleniumassignment.automation.pom.pages.ProductDetails;
import seleniumassignment.automation.pom.pages.SearchResults;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonSteps implements En {
    private WebDriver driver;
    private AbstractPage userActions1;
    private AbstractPage userActions2;
    private AbstractPage userActions3;
    private AbstractPage userActions4;
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
            userActions1 = new HomePage(driver);
            userActions2 = new SearchResults(driver);
            userActions3 = new ProductDetails(driver);
            userActions4 = new MyWishListPage(driver);
        });
        Before(new String[]{"@web", "@firefox"}, 0, 1, (Scenario scenario) -> {
            driver = this.sharedContext.getDriver("firefox");
            userActions1 = new HomePage(driver);
            userActions2 = new SearchResults(driver);
            userActions3 = new ProductDetails(driver);
            userActions4 = new MyWishListPage(driver);
        });

        Given("^launch a browser and navigate website home page$", () -> {
            userActions1.navigateToHomePage();
        });
        When("^I type product name ([^\\\"]*) on the search box$", (String product) -> {

            userActions1.enterSearchPhrase(product);
        });
        When("^I click on search icon or hit enter$", () -> {
            userActions1.clickOnSearchBoxIcon();
        });
        When("^I click on any product on the page$", () -> {
            userActions2.clickFirstProduct();
        });
        Then("^Page URL should have product id at the end$", () -> {
            assertThat(driver.getCurrentUrl().contains(userActions3.getProductId()));
        });
        When("^I click on Add to Wish List button on the page$", () -> {
            userActions3.clickAddToWishListBtn();
        });
        Then("^I should see the button text is turned as Added$", () -> {
            assertThat(userActions3.verifyAddedButton()).isTrue();
        });
        When("^I click on Wish List link on the header$", () -> {
            userActions3.clickOnWishListLink();
        });
        Then("^I should see the same product added in my Wish List$", () -> {
            userActions4.isProductAddedIntoWishList();
        });
        After(new String[]{"@web"}, (Scenario scenario) -> {
            this.sharedContext.tearDown();
        });
    }
}
