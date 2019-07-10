package seleniumassignment.automation.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import seleniumassignment.automation.pom.actions.AbstractPage;
import seleniumassignment.automation.pom.uielements.SearchResultPageElements;

public class SearchResults extends AbstractPage implements SearchResultPageElements{

        By BY_SEARCH_RESULT = By.xpath(SearchResultPageElements.SEARCH_RESULT);
        By BY_FIRST_PRODUCT = By.xpath(SearchResultPageElements.FIRST_PRODUCT);

        public SearchResults(WebDriver driver) {
            super(driver);
        }

        public boolean pageTitle(WebDriver driver, String expectedlTitle) {
            String actualTile = driver.getTitle();
            return actualTile.equalsIgnoreCase(expectedlTitle);
        }
        public boolean pageUrlContains(String phrase) {
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
