package pist6.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.util.List;

public class Register_info {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https:pist6-dev-basicauth:qdc6FGTV9jSk@dev.pist6-bet.bla-one.net/registration?token=2EdLTyiQOEaf66Yn1c841ab403c54adc44f4f4ea21293d5c");
        driver.manage().window().maximize();
        WebElement emailCheck = driver.findElement(By.xpath("//input[@placeholder='mail@pist6.com']"));
        emailCheck.getCssValue("sakura2310+70@gmail.com");
        System.out.println("ĐÚng Email đã dk");
        //Get list title tren page
        List<WebElement> titleList = driver.findElements(By.xpath("//form[@class='h-adr registration__form']/descendant::p"));
        System.out.println(titleList.size());
        for (int i = 0; i < titleList.size(); i++) {
            System.out.println(titleList.get(i).getText());
        }


        WebElement radioMale = driver.findElement(By.xpath("//input[@id='sex-1']"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioMale);

        Thread.sleep(2000);

        boolean isSlectedSex = radioMale.isSelected();
        if (isSlectedSex == true) {
            System.out.println("Selected Male");
        } else {
            System.out.println("Male Incorrect Spec");
        }
        WebElement radioFamale = driver.findElement(By.xpath("//input[@id='sex-0']"));
        boolean isSlectedFemale = radioFamale.isSelected();
        if (isSlectedFemale == true) {
            System.out.println("Famale Incorrect Spec");
        } else {
            System.out.println("Famale Correct Spec");
        }
        Thread.sleep(3000);
        driver.quit();
    }

    }