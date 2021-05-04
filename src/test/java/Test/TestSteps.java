package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSteps {

    public WebDriver setupDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.miniprix.ro/");
        driver.manage().window().maximize();
        return driver;
    }

    public String login(WebDriver driver, String username, String password) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")));
        WebElement CookieButton = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        CookieButton.click();

        WebElement authButton = driver.findElement(By.xpath("//div[@class='vtex-login-2-x-container flex items-center fr']"));
        authButton.click();

        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Autentificare cu adresa de email și parolă')]")));
        WebElement SwitchToMailandPassword = driver.findElement(By.xpath("//span[contains(text(), 'Autentificare cu adresa de email și parolă')]"));
        SwitchToMailandPassword.click();

        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
        WebElement Email = driver.findElement(By.xpath("//input[@type='text']"));
        //Email.sendKeys("lucianaaus@yahoo.com");
        Email.sendKeys(username);

        WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
        //Password.sendKeys("Anastasia@21");
        Password.sendKeys(password);

        WebElement autentificareButton = driver.findElement(By.xpath("//span[contains(text(), 'Autentificare')]"));
        autentificareButton.click();

        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='vtex-login-2-x-profile truncate t-action--small order-1 pl4 gray dn db-l']")));
        WebElement helloMessage = driver.findElement(By.xpath("//span[@class='vtex-login-2-x-profile truncate t-action--small order-1 pl4 gray dn db-l']"));
        String welcomeText = helloMessage.getText();
        return welcomeText;
    }
}
