package pist6.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.util.List;

public class Register_info {
    public static void main(String[] args) throws InterruptedException {


    WebDriver driver = new ChromeDriver();
    driver.get("https:pist6-dev-basicauth:qdc6FGTV9jSk@dev.pist6-bet.bla-one.net/registration?token=d6IM0aGso0ipOlPk8dc52a9bf52f5954c5f7063b8f0d093a");
        driver.manage().window().maximize();
    WebElement emailCheck = driver.findElement(By.xpath("//input[@placeholder='mail@pist6.com']"));
    emailCheck.getCssValue("sakura2310+70@gmail.com");
    System.out.println("ĐÚng Email đã dk");
        List<WebElement> titleList = driver.findElements(By.xpath("//p"));
        for (i=0, i<titleList.size(); i++){
            System.out.println(titleList.get(i).getText());
        }


        WebElement radioMale = driver.findElement(By.xpath("//input[@id='sex-1']"));
      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",radioMale);

      Thread.sleep(2000);

        boolean isSlectedSex = radioMale.isSelected();
        if (isSlectedSex == true){
            System.out.println("Selected Male");
            }
        else {
            System.out.println("Male Incorrect Spec");
        }
        WebElement radioFamale = driver.findElement(By.xpath("//input[@id='sex-0']"));
        boolean isSlectedFemale = radioFamale.isSelected();
        if (isSlectedFemale == true){
            System.out.println("Famale Incorrect Spec");
        }
        else {
            System.out.println("Famale Correct Spec");
        }
        Thread.sleep(3000);
        driver.quit();

    }
}
