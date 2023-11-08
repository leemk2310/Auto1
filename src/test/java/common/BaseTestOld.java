package common;

import Help.Sleep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTestOld {

    public static WebDriver driver = new ChromeDriver();
  //  public  WebDriver driver;

//      @Parameters("browserName")
//
//        public void Setup(@Optional("chrome")String browserName) {
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
    public void run() {

        driver.get("https://cms.testlery.com/user/login");

        driver.manage().window().maximize();
        Sleep.sleep(5);
    }

   @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }


}
