package pist6.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_info {
    public static void main(String[] args) throws InterruptedException {


    WebDriver driver = new ChromeDriver();
    driver.get("https:pist6-dev-basicauth:qdc6FGTV9jSk@dev.pist6-bet.bla-one.net/registration?token=d6IM0aGso0ipOlPk8dc52a9bf52f5954c5f7063b8f0d093a");
        driver.manage().window().maximize();
    WebElement emailCheck = driver.findElement(By.xpath("//input[@placeholder='mail@pist6.com']"));
    emailCheck.getCssValue("sakura2310+70@gmail.com");
    System.out.println("ĐÚng Email đã dk");
//    WebElement passWord = driver.findElement(By.cssSelector("input[name='password']"));
//            passWord.sendKeys("neo12345");
//
//    WebElement confirmPW = driver.findElement(By.xpath("//input[@placeholder='確認のため、もう一度入力してください']"));
//    confirmPW.sendKeys("neo3456");
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
