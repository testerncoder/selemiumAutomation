package seleniumassignment.automation.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import seleniumassignment.automation.pom.actions.AbstractPage;
import seleniumassignment.automation.pom.uielements.SearchResultPageElements;


public class SearchResults extends AbstractPage implements SearchResultPageElements {

    By BY_FIRST_PRODUCT = By.xpath(SearchResultPageElements.FIRST_PRODUCT);
    By PRODUCT_PRICE_BUTTON = By.xpath(SearchResultPageElements.PRODUCT_PRICE_BUTTON);

    public SearchResults(WebDriver driver) {
        super(driver);
    }

    // Find product Id from article tag using attribute name
    public String getProductId() {
        String productId = getDriver().findElement(BY_FIRST_PRODUCT).getAttribute("data-product-id");
        return productId;
    }

    // Click on the First Product of the search Results
    public void clickFirstProduct() {
        WebElement clickProduct = driverWait(10).until(ExpectedConditions.elementToBeClickable(PRODUCT_PRICE_BUTTON));
        clickProduct.click();

    }
}

