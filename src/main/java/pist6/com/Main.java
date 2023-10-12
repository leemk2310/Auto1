package pist6.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }


        WebDriver driver = new ChromeDriver();
        driver.get("https:pist6-dev-basicauth:qdc6FGTV9jSk@dev.pist6-bet.bla-one.net");
        driver.manage().window().maximize();
        WebElement loginIcon = driver.findElement(By.xpath("//div[@class='container-fluid flex-between header-pc']//div[2]"));
       Thread.sleep(2000);
        loginIcon.click();
        // WebElement inputEmail = driver.findElement(By.name("email"));
        WebElement inputEmail = driver.findElement(By.cssSelector("input[class='btn btn-input-white fs-14 w-100 login__form-input']"));
        inputEmail.sendKeys("sakura2310+40@gmail.com");
        WebElement inputPassword = driver.findElement(By.cssSelector("[placeholder='パスワードを入力してください']"));
        inputPassword.sendKeys("neo12345");


//        WebElement loginButton = driver.findElement(By.cssSelector("[type='submit']"));
//        loginButton.click();
//        Thread.sleep(3000);
//        WebElement myPageButton = driver.findElement(By.xpath("//a[@class='d-flex justify-content-center align-items-center']"));
//        myPageButton.click();
//        Thread.sleep(3000);
//// -- text link
//        WebElement TUE = driver.findElement(By.linkText("車券の購入は20歳になってから。競輪は適度に楽しみましょう。"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TUE);
//        Thread.sleep(3000);
//        TUE.click();
//        WebElement settingButton = driver.findElement(By.cssSelector("a[href='/account-setting']"));
//        settingButton.click();
//        Thread.sleep(2000);
//--- Vote
//            WebElement voteButtonMP = driver.findElement(By.cssSelector("div[class= 'btn btn-primary-red rounded-20 w-95 w-md-100 cl-4a font-normal py--12 py-md--10']"));
//                voteButtonMP.click();
//        Thread.sleep(2000);
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