package Minano;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class MainMinano {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        String username = "Keirin-Dev";
        String password = "NeoDev#!2018";
        ((HasAuthentication) driver).register(UsernameAndPassword.of(username, password));
        driver.get("https://dev.keirin.bla-one.net/top");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

    }
}
