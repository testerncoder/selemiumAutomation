package seleniumassignment.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

    private WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }

    protected WebDriverWait driverWait(long timeoutSeconds) {
        return new WebDriverWait(driver, timeoutSeconds);
    }

    public void navigateToHomePage() {}
    public void enterSearchPhrase(String phrase) {}
    public boolean pageTitleContains(String phrase) {return true;}
    public void  clickFirstProduct(){}
    public void clickAddToWishListBtn(){}
    public void clickOnWishListLink(){}
    public boolean isProductAddedIntoWishList(){return true;}
}