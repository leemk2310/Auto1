package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Class {
    @Test(dataProvider = "data_fullname_input", dataProviderClass = Data.class)
    public static void runChrome(String fullName, String name) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        WebElement fullNameTextbox = driver.findElement(By.xpath("//input[@id='userName']"));
        fullNameTextbox.sendKeys(fullName);
        Thread.sleep(2000);

        driver.quit();

    }

}
