package Test;

import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    public static WebDriver driver;
    public static TestSteps testSteps = new TestSteps();

    @BeforeClass
    public static void initDriver() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        driver = testSteps.setupDriver();
    }

    @After
    public void quitDriver() {
        // driver.quit();
    }

    public void performDefaultLogin(){
        testSteps.login(driver, "lucianaaus@yahoo.com", "Anastasia@21");
    }

}
