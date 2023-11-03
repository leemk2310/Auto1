package testcase;

import common.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.sql.SQLOutput;
import java.time.Duration;


public class LoginTest extends BaseTest {


    @Test(priority = 1,dataProvider = "data_provider_login1", dataProviderClass = testcase.LoginData.class)
    public void LoginIncorrectAccTestcase(String email, String passWord, String validateText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));

        WebElement emailLogin = driver.findElement(By.xpath("//input[@id='email']"));
        emailLogin.sendKeys(email);
        WebElement passWordLogin = driver.findElement(By.xpath("//input[@id='password']"));
        passWordLogin.sendKeys(passWord);
        WebElement signInClick = driver.findElement(By.xpath("//button[normalize-space()='Sign In']"));
        signInClick.click();
        WebElement errorText = driver.findElement(By.xpath("//li[contains(text(),'These credentials do not match our records.')]"));
        String getText = errorText.getText();
        System.out.println(getText);
        getText = validateText;
    }

    @Test(priority = 2,dataProvider = "data_provider_login2", dataProviderClass = testcase.LoginData.class)
    public void LoginCorrectAccTestcase(String email, String passWord, String validateText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));

        WebElement emailLogin = driver.findElement(By.xpath("//input[@id='email']"));
        emailLogin.sendKeys(email);
        WebElement passWordLogin = driver.findElement(By.xpath("//input[@id='password']"));
        passWordLogin.sendKeys(passWord);
        WebElement signInClick = driver.findElement(By.xpath("//button[normalize-space()='Sign In']"));
        signInClick.click();
        WebElement LoginComplete = driver.findElement(By.xpath("//h1[normalize-space()='Welcome, User!']"));
        String getText = LoginComplete.getText();
        System.out.println(getText);
        getText = validateText;


    }
}
