package seleniumassignment.automation.pom.actions;

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
    public void clickOnSearchBoxIcon(){}
    public boolean pageTitle() {return true;}
    public boolean pageUrlContains(String phrase) {return true;}
    public void  clickFirstProduct(){}
    public void clickAddToWishListBtn(){}
    public void clickOnWishListLink(){}
    public boolean isProductAddedIntoWishList(){return true;}

}
