package seleniumassignment.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

    public class SearchResults extends AbstractPage {

        //private static final By BY_SEARCH_RESULT = By.xpath("//h1[@class='page-heading search-result_header']/span[2]");
        private static final By BY_FIRST_PRODUCT = By.xpath("//div[@class='codified-product-tile__row--price-button has-price-value']");

        public SearchResults(WebDriver driver) {
            super(driver);
        }

        public boolean pageTitleContains(String phrase) {
            try {
                return driverWait(20).until(ExpectedConditions.titleContains(phrase));
            } catch (TimeoutException ex) {
                return false;
            }
        }
        public void clickFirstProduct()
        {
            WebElement clickProduct = driverWait(10).until(ExpectedConditions.elementToBeClickable(BY_FIRST_PRODUCT));
            clickProduct.click();
        }

}
