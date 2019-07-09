package seleniumassignment.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends AbstractPage {

    private static final String PAGE_HOME_URL = "https://www.bunnings.com.au";
    private static final By BY_SEARCH_FIELD = By.xpath("//div[@class='search-container_container' ]/child::input[@type='text']");
    private static final By BY_ADD_TO_WISH_LIST = By.xpath("//button[@class='btn-add-wishlist inactive']//span[contains(text(), 'Add to Wish List')]");
    private static final By BY_WISH_LIST_LINK = By.xpath("//span[@class='header_navbar-link-copy' and @data-copy= 'Wish List']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToHomePage() {
        getDriver().navigate().to(PAGE_HOME_URL);
    }

    public void enterSearchPhrase(String phrase) {
        WebElement searchField = driverWait(5).until(ExpectedConditions.elementToBeClickable(BY_SEARCH_FIELD));
        searchField.sendKeys(phrase);
        searchField.submit();
    }
    public void clickAddToWishListBtn()
    {
        WebElement clickProduct = driverWait(60).until(ExpectedConditions.elementToBeClickable(BY_ADD_TO_WISH_LIST));
        clickProduct.click();
    }
    public void clickOnWishListLink()
    {
        WebElement clickProduct = driverWait(5).until(ExpectedConditions.elementToBeClickable(BY_WISH_LIST_LINK));
        clickProduct.click();
    }
}
