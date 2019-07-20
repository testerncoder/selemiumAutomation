package seleniumassignment.automation.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import seleniumassignment.automation.pom.actions.AbstractPage;
import seleniumassignment.automation.pom.uielements.ProductDetailPageElements;

public class ProductDetails extends AbstractPage implements ProductDetailPageElements {

    By BY_ADD_TO_WISH_LIST = By.xpath(ProductDetailPageElements.ADD_TO_WISH_LIST_XPATH);
    By BY_WISH_LIST_LINK = By.xpath(ProductDetailPageElements.WISH_LIST_LINK_XPATH);
    By By_GET_PRODUCT_ID = By.xpath(ProductDetailPageElements.GET_PRODUCT_ID_XPATH);

    public ProductDetails(WebDriver driver) {
        super(driver);
    }

    // Find product Id from article tag using attribute name
    public String getProductId() {
        String testId = getDriver().findElement(By_GET_PRODUCT_ID).getAttribute("content");
        return testId;
    }
    // Click on Add To WishList Button
    public void clickAddToWishListBtn() {
        WebElement clickProduct = driverWait(10).until(ExpectedConditions.elementToBeClickable(BY_ADD_TO_WISH_LIST));
        clickProduct.click();
    }
    // Verify that button text has changed as Added
    public boolean verifyAddedButton() {
        WebElement addedWishListBtn = driverWait(10).until(ExpectedConditions.presenceOfElementLocated(BY_ADD_TO_WISH_LIST));
        //It will wait for 3 seconds assuming the response of API will take time
        try{ Thread.sleep(3000); } catch(InterruptedException ie){ }
        return addedWishListBtn.getAttribute("class").contains("added");
    }
    // Click on WishList link on the header
    public void clickOnWishListLink() {
        WebElement clickWishListBtn = driverWait(5).until(ExpectedConditions.elementToBeClickable(BY_WISH_LIST_LINK));
        clickWishListBtn.click();
    }
}
