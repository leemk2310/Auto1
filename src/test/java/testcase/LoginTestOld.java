package testcase;

import DataTest.LoginData;
import common.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;


public class LoginTestOld extends BaseTestOld {


    @Test(priority = 1,dataProvider = "data_provider_login1", dataProviderClass = LoginData.class)
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

    @Test(priority = 2,dataProvider = "data_provider_login2", dataProviderClass = LoginData.class)
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



    }

    public void testLoginPass() {

    }


}
