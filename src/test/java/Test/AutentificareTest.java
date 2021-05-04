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

public class AutentificareTest extends BaseTest {

    /**
     * Steps:
     * 1. Login with valid username and password
     * 2. Check welcome text to be "Salut," + email address"
     */

    @Test
    public void autentificareTest() {
        String welcomeText = testSteps.login(driver, "lucianaaus@yahoo.com", "Anastasia@21");
        Assert.assertEquals("SALUT, LUCIANAAUS@YAHOO.COM", welcomeText);
    }
}

