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

    public ProductDetails(WebDriver driver) {
        super(driver);
    }

    // Click on Add To WishList Button
    public void clickAddToWishListBtn() {
        WebElement clickProduct = driverWait(60).until(ExpectedConditions.elementToBeClickable(BY_ADD_TO_WISH_LIST));
        clickProduct.click();
    }

    // Verify that button text has changed as Added
    public boolean verifyButton() {
        WebElement addedWishListBtn = driverWait(10).until(ExpectedConditions.elementToBeClickable(BY_ADD_TO_WISH_LIST));
        return addedWishListBtn.getText().equalsIgnoreCase("Added");
    }

    // Click on WishList link on the header
    public void clickOnWishListLink() {
        WebElement clickWishListBtn = driverWait(5).until(ExpectedConditions.elementToBeClickable(BY_WISH_LIST_LINK));
        clickWishListBtn.click();
    }
}
