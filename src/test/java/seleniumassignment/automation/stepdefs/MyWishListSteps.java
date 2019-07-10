package seleniumassignment.automation.stepdefs;

import seleniumassignment.automation.config.SharedContext;
import seleniumassignment.automation.pom.actions.AbstractPage;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class MyWishListSteps implements En {

    private WebDriver driver;
    private AbstractPage userActions;
    private SharedContext sharedContext;
    public MyWishListSteps(SharedContext sharedContext) {
        this.sharedContext = sharedContext;
//
//        When("^I click on Add to Wish List button on the page$", () -> {
//            userActions.clickAddToWishListBtn();
//        });
//        When("^I click on Wish List link on the header$", () -> {
//            userActions.clickOnWishListLink();
//        });
//        Then("^Product should be added in my Wish List$", () -> {
//            assertThat(userActions.isProductAddedIntoWishList()).isTrue();
//        });
    }
}
