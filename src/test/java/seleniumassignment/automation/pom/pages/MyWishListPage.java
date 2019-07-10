package seleniumassignment.automation.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import seleniumassignment.automation.pom.actions.AbstractPage;
import seleniumassignment.automation.pom.uielements.WishListPageElements;

public class MyWishListPage extends AbstractPage implements WishListPageElements {

    SearchResults productId = new SearchResults(this.getDriver());
    By BY_Item_In_List = By.xpath(WishListPageElements.Item_In_List);

    public MyWishListPage(WebDriver driver) {
        super(driver);
    }

    // Verify that product is added into WishList
    public boolean isProductAddedIntoWishList() {
        WebElement checkItemInList = driverWait(20).until(ExpectedConditions.elementToBeClickable(BY_Item_In_List));
        return checkItemInList.getText().contains(productId.getProductId());
    }
}
