package Test;


import org.junit.Assert;
import org.junit.BeforeClass;
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

public class AutentificareTest {

    public static WebDriver driver;
    public TestSteps testSteps = new TestSteps();

    @BeforeClass
    public static void initDriver() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.miniprix.ro/");
        driver.manage().window().maximize();
    }

    @Test
    public void AutentificareTest() {
        String welcomeText = testSteps.login(driver, "lucianaaus@yahoo.com", "Anastasia@21");
        Assert.assertEquals("SALUT, LUCIANAAUS@YAHOO.COM", welcomeText);
    }

}

