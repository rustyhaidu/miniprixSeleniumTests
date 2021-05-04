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

public class CategorieTest {

    public WebDriver driver;

    @Test
    public void CategorieTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.miniprix.ro/");
        driver.manage().window().maximize();


        List<WebElement> Gender = driver.findElements(By.xpath("//ul[@class='vtex-menu-2-x-menuContainer vtex-menu-2-x-menuContainer--MPX-main-menu list flex pl0 mv0 flex-row']"));
        for (int index = 0; index < Gender.size(); index++) {
            String currentElement = Gender.get(index).getText();
            if (currentElement.equals("Jeans"))
            {
                Gender.get(index).click();
            }
        }


    }
}