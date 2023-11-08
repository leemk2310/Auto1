package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

import common.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoQAPage {

    @FindBy(xpath = "//button[@title='Toggle']//*[name()='svg']")
    private WebElement openMainMenu;
    @FindBy(xpath = "//div[@id='tree-node']/ol/li/span/button[@title='Toggle']")
    private WebElement collapseMenu;
    @FindBy(xpath = "//label[@for='tree-node-home']/span[@class='rct-checkbox']")
    private WebElement homeCheckBox;

    @FindBy(xpath = "//label[@for='tree-node-home']/span[@class='rct-node-icon']")
    private  WebElement checkColor;

    public DemoQAPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void OpenMenu()  {

        openMainMenu.click();


    }
    //    public void CloseMenu() throws InterruptedException {
//        collapseMenu.click();
//        Thread.sleep(3000);
//    }
    public void ClickHomeCheckBox() throws InterruptedException {
        homeCheckBox.click();
        Thread.sleep(3000);
    }

}