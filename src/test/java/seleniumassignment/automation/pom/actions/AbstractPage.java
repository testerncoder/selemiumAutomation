package seleniumassignment.automation.pom.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

    // WebDriver initialization and passing driver to abstract class constructor
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
    // Abstract user actions methods
    private String productId;
    public void navigateToHomePage() {}
    public void enterSearchPhrase(String phrase) {}
    public void clickOnSearchBoxIcon(){}
    public String getProductId(){return productId;}
    public void  clickFirstProduct(){}
    public void clickAddToWishListBtn(){}
    public void clickOnWishListLink(){}
    public boolean verifyAddedButton(){return true;}
    public boolean isProductAddedIntoWishList(){return true;}

}
