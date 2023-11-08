package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoQATest {
    public static WebDriver driver = new ChromeDriver();
    @Test
    public void run() throws InterruptedException {
         driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        Thread.sleep(3000 );

    }
    @AfterTest
    public  void CloseBrowser(){
        driver.quit();
    }


}
