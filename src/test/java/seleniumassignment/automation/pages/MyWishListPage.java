package seleniumassignment.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyWishListPage extends AbstractPage {

    private static final By BY_Item_In_List = By.xpath("//div[@class='search-container_container' ]/child::input[@type='text']");

    public MyWishListPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductAddedIntoWishList() {
        WebElement checkProduct = driverWait(20).until(ExpectedConditions.elementToBeClickable(BY_Item_In_List));
        return checkProduct.getText().contains("items in your Wish List");
    }

}
