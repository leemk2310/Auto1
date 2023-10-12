package pist6.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Register_flow {
    public static void main(String[] args) throws InterruptedException {
                WebDriver driver = new ChromeDriver();
        driver.get("https:pist6-dev-basicauth:qdc6FGTV9jSk@dev.pist6-bet.bla-one.net");
        driver.manage().window().maximize();
        WebElement loginIcon = driver.findElement(By.xpath("//div[@class='container-fluid flex-between header-pc']//div[2]"));
        Thread.sleep(2000);
        loginIcon.click();

        WebElement passwordCheckBox = driver.findElement(By.xpath("//label[@for='enable_password']"));

        Boolean isSelectedPW = passwordCheckBox.isSelected();
        if (isSelectedPW == false)
        {
            System.out.println("chưa dc chọn");
            passwordCheckBox.click();
            System.out.println("vua dc chon");
        }
        else {
            System.out.println(" da select");
        }
        WebElement saveMeCheckBox = driver.findElement(By.xpath("//label[@for='save_me']"));
        boolean isSelectedSaveme = saveMeCheckBox.isSelected();
        if (isSelectedSaveme == true)
        {
            System.out.println("chua chon");
            saveMeCheckBox.click();
            System.out.println("vua chon xong");
        }
        else {
            System.out.println("da dc chon");
            saveMeCheckBox.click();
            System.out.println("da uncheck");
        }

        Thread.sleep(3000);

        WebElement linkRegisterPage = driver.findElement(By.linkText("会員登録はこちら"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", linkRegisterPage);
        linkRegisterPage.click();
        Thread.sleep(2000);
        WebElement inputRegisterEmail = driver.findElement(By.cssSelector("input[placeholder='sample@mail.com']"));
        inputRegisterEmail.sendKeys("sakura2310+70@gmail.com");
        Thread.sleep(2000);
        WebElement registerButton = driver.findElement(By.xpath("//form[1]//div[2]//button[1]"));
        registerButton.click();
        System.out.println("Register completed");

        Thread.sleep(2000);


        driver.quit();
    }
}