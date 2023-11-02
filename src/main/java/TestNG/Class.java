package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class Class {
    public static void runChrome (){

    WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/text-box");
    driver.manage().window().maximize();

    }

}
