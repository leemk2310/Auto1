package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import driver.DriverManager;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

public class DemoSitePage_Profile {
    public static final String URL = "https://demo.automationtesting.in/Register.html";
    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firsname;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastName;
    @FindBy(xpath = "//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea[@ng-model='Adress']")

    private WebElement address;
    @FindBy(xpath = "//input[@type='email']")
    private WebElement userEmail;
    @FindBy(xpath = "//input[@type='tel']")
    private WebElement phone;
    @FindBy(xpath = "//label[normalize-space()='Male']")
    private WebElement male;
    @FindBy(xpath = "//label[normalize-space()='FeMale']")
    private WebElement faMale;
    @FindBy(xpath = "//input[@id='checkbox1']")
    private WebElement cricketCheckBox;
    @FindBy(xpath = "//input[@id='checkbox2']")
    private WebElement moviesCheckBox;
    @FindBy(xpath = "//input[@id='checkbox1']")
    private WebElement hockeyCheckBox;
    @FindBy(xpath = "//div[@class='col-md-4 col-xs-4 col-sm-4']//multi-select")
    private WebElement languages;

    @FindBy(xpath = "//select[@id='Skills']")
    private WebElement skillDropList;
    @FindBy(xpath = "//span[@role='combobox']")
    private  WebElement selectCountryMenu;

    @FindBy(xpath = "//input[@role='textbox']")
    private WebElement countryInput;

    @FindBy(xpath = "//span[@id='select2-country-container']")
    private WebElement country;
    @FindBy(xpath = "//ul[@id='select2-country-results']")
    private  WebElement listCountry;
    @FindBy(xpath ="//select[@id='yearbox']")
    private  WebElement yearList;
    @FindBy(xpath = "//select[@placeholder='Month']")
    private WebElement monthList;
    @FindBy(xpath ="//select[@id='daybox']" )
    private WebElement dateList;
    @FindBy(xpath = "//input[@id='firstpassword']")
    private WebElement passWord;
    @FindBy(xpath = "//input[@id='secondpassword']")
    private WebElement confirmPass;



    public DemoSitePage_Profile() {
        WebDriver driver = DriverManager.getDriver();
        driver.get(URL);
        PageFactory.initElements(driver, this);

    }

    public void inputFirstName(String firstName) {
        firsname.sendKeys(firstName);
//       String placeHolder = firsname.getText();
//        if(placeHolder == "First Name") {
//            firsname.sendKeys(firstName);
//       }
    }

    public void inputLastName(String lastNameinput) {
        lastName.sendKeys(lastNameinput);
        String placeHolder = lastName.getText();
//        if (placeHolder== "Last Name"){
//            lastName.sendKeys(lastNameinput);
//        }
    }

    public void setAddress(String addressInput) {
        address.sendKeys(addressInput);
    }

    public void setEmail(String email) {
        userEmail.sendKeys(email);
    }

    public void setPhone(String phoneNumber) {

        phone.sendKeys(phoneNumber);
    }

    public void genderMale() {
        male.click();

    }

    public boolean checkSelect() {
        male.isSelected();
        return true;
    }

    public void setCricketCheckBox() {
        cricketCheckBox.click();
    }

    public void setMoviesCheckBox() {
        moviesCheckBox.click();
    }

    public void setHockeyCheckBox() {
        hockeyCheckBox.click();
    }

    public boolean checkCriketCheckbox() {
        cricketCheckBox.isSelected();
        return false;
    }

    public boolean checkMoviesCheckBox() {
        moviesCheckBox.isSelected();
        return false;
    }

    public boolean checkHockeyCheckBox() {
        hockeyCheckBox.isSelected();
        return false;
    }

//check Multi Select on Droplist
          public  void radioLanguage () {
          WebDriver driver = DriverManager.getDriver();
          List<WebElement> listSelect = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li"));
          listSelect.forEach(element -> {
              String text = element.findElement(By.tagName("a")).getText();
              System.out.println(text);
              if (text.equals("Vietnamese")) {
                  element.findElement(By.tagName("a")).click();
              }
          });
      }


    public void setSkill(String skillValue) {
        Select select = new Select(skillDropList);
        select.selectByValue(skillValue);
        // get giá trị đã đươc select trong droplist
        String optionLabel = select.getFirstSelectedOption().getText();
        System.out.println(optionLabel);
    }
    //Search correct country
    public  void  setCountry (String countryValue){
        WebDriver driver = DriverManager.getDriver();
        selectCountryMenu.click();
        countryInput.sendKeys(countryValue);
        Actions  action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();

        String countrySelect = country.getText();
        System.out.println(countrySelect);

    }
    public  void  setInccorectCountry (String countryValue){
        WebDriver driver = DriverManager.getDriver();
        selectCountryMenu.click();
        countryInput.sendKeys(countryValue);
        listCountry.getText();
        //System.out.println(listCountry.getText());
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN).perform();
        action.sendKeys(Keys.ENTER).perform();
        String countrySelect = country.getText();
        System.out.println(countrySelect);
    }
    public  void setyear (String year){
        Select select = new Select(yearList);
        select.selectByValue(year);
    }
    public  void setMonth  (String month){
        Select select = new Select(monthList);
        select.selectByValue(month);
    }
    public  void setdate (String date){
        Select select = new Select(dateList);
        select.selectByValue(date);
    }
    public  void setPassWord (String pass, String secondPW){
        passWord.sendKeys(pass);
        confirmPass.sendKeys(secondPW);
    }



}
