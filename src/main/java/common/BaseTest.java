package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseTest {
    public static WebDriver driver = new ChromeDriver();

    //  @Parameters("browserName")

    //    public void Setup(@Optional("chrome")String browserName) {
//        if (browserName.equalsIgnoreCase("chrome")) {
//            driver = new ChromeDriver();
//        }
//        if (browserName.equalsIgnoreCase("firefox")) {
//            driver = new FirefoxDriver();
//        }
//        if (browserName.equalsIgnoreCase("edge")) {
//            driver = new EdgeDriver();
//        }
//
//    }
    @Test
    public void run() throws InterruptedException {

        driver.get("https://cms.testlery.com/user/login");
        driver.manage().window().maximize();
        Thread.sleep(3000 );

    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }


}
