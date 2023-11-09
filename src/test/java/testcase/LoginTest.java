package testcase;

import DataTest.LoginData;
import PageObject.LoginPage;
import common.BaseTest;
import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @Test(priority = 1, dataProvider = "data_provider_login1", dataProviderClass = DataTest.LoginData.class )
    public void LoginFail(String email, String passWord) {


        LoginPage login = new LoginPage();
        login.login(email, passWord);

        String errorText = login.errorMessage();
        Assert.assertEquals(errorText, "These credentials do not match our records.");

    }
    @Test(priority = 2, dataProvider = "data_provider_login2", dataProviderClass = LoginData.class)
    public  void LoginPass (String email, String passWord){
        WebDriver driver = DriverManager.getDriver();
        LoginPage login = new LoginPage();
        login.login(email, passWord);
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        String successText = login.successMessage();

        Assert.assertEquals(successText,"Welcome, User!");
    }

}
