package seleniumassignment.automation.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import seleniumassignment.automation.pom.actions.AbstractPage;
import seleniumassignment.automation.pom.uielements.HomePageElements;

public class HomePage extends AbstractPage implements HomePageElements {

    private static final String PAGE_HOME_URL = "https://www.bunnings.com.au";

    //
    By BY_SEARCH_FIELD = By.xpath(HomePageElements.SEARCH_FIELD_XPATH);
    By BY_SEARCH_BOX_ICON = By.xpath(HomePageElements.SEARCH_BOX_ICON_XPATH);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Launch home page URL
    public void navigateToHomePage() {
        getDriver().navigate().to(PAGE_HOME_URL);
    }

    // Type given phrase
    public void enterSearchPhrase(String phrase) {
        WebElement searchField = driverWait(5).until(ExpectedConditions.elementToBeClickable(BY_SEARCH_FIELD));
        searchField.sendKeys(phrase);
    }

    // Click on Search Icon to see the search results
    public void clickOnSearchBoxIcon() {
        WebElement clickSearchIcon = driverWait(20).until(ExpectedConditions.elementToBeClickable(BY_SEARCH_BOX_ICON));
        clickSearchIcon.click();
    }

}
