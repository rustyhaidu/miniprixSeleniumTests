package Test;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CategorieTest extends BaseTest {

    /**
     * Steps:
     * 1. Login
     * 2. Click on "Femei" link/button
     * 3. Click on "Genti"
     * 4. Hover over the 3rd article
     * 5. Click on "Pune In Cos" (Pop-up window is displayed)
     * 6. Choose size ("Unica")
     * 7. Click on "Pune in Cos" again
     * 8. Close the windows that are automatically opened
     * 9. Click on "Barbati"
     * 10. Click on Pantofi ("Pune In Cos" - like before from 4. to 6.
     * 11. Select size 44
     * 12. Close pop-up and check on the right that there are two products
     * 13. Remove products from cart
     * 14. Check that there 0 products in cart
     */

    @Test
    public void CategorieTest() throws InterruptedException {
        // 1.
        performDefaultLogin();

        // 2.
        new WebDriverWait(driver, 10).until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//div[contains(text(), 'FEMEI')]")));
        WebElement femeiLinkButton = driver.findElement(By.xpath("//div[contains(text(), 'FEMEI')]"));
        femeiLinkButton.click();

        // 3.
        new WebDriverWait(driver, 10).until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//p[contains(text(), 'GENTI')]")));
        WebElement gentiButton = driver.findElement(By.xpath("//p[contains(text(), 'GENTI')]"));
        gentiButton.click();

        // 4.
        Thread.sleep(2000);
        List<WebElement> listOfPurses = driver.findElements(By.xpath("//article"));
        WebElement elementulDorit = listOfPurses.get(2);
        Actions action = new Actions(driver);
        action.moveToElement(elementulDorit).build().perform();
        Thread.sleep(1000);
        WebElement buttonPuneInCos = driver.findElement(By.xpath("//p[contains(text(), 'PUNE IN COS')]"));
        action.moveToElement(buttonPuneInCos).click().build().perform();

    }
}
