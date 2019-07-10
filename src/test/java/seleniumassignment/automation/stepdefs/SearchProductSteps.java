package seleniumassignment.automation.stepdefs;

import seleniumassignment.automation.config.SharedContext;
import seleniumassignment.automation.pom.actions.AbstractPage;
import cucumber.api.java8.En;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchProductSteps implements En {
    private AbstractPage userActions;
    private SharedContext sharedContext;

    public SearchProductSteps(SharedContext sharedContext) {
        this.sharedContext = sharedContext;

//        When("^I type product name \"([^\"]*)\" on the search box$", (String text) -> {
//            userActions.enterSearchPhrase(text);
//        });
//        When("^I click on search icon or hit enter$", () -> {
//            userActions.clickOnSearchBoxIcon();
//        });
//
//        Then("^I should be redirected to the next page, title should be \"([^\"]*)\"$",(String expectedTitle) ->  {
//            userActions.pageTitle();
//        });
//
//        Then("^URL of the page should have \"([^\"]*)\" on it$", (String text) -> {
//            assertThat(userActions.pageUrlContains(text)).isTrue();
//        });
//
//        When("^I click on any product on the page$", () -> {
//            userActions.clickFirstProduct();
//        });
    }
}
