package seleniumassignment.automation.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import seleniumassignment.automation.pom.actions.AbstractPage;
import seleniumassignment.automation.pom.uielements.WishListPageElements;

public class MyWishListPage extends AbstractPage implements WishListPageElements{

    By BY_Item_In_List = By.xpath(WishListPageElements.Item_In_List);

    public MyWishListPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductAddedIntoWishList() {
        WebElement checkProduct = driverWait(20).until(ExpectedConditions.elementToBeClickable(BY_Item_In_List));
        return checkProduct.getText().contains("items in your Wish List");
    }

}
