package common;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DemoSiteBaseTest {
    @BeforeMethod
    public  void runBrowser (){
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        DriverManager.setDriver(driver);

    }
    @AfterMethod
    public  void closeBrowser(){
        DriverManager.quitDriver();
    }

}
