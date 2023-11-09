package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import driver.DriverManager;
import org.openqa.selenium.support.PageFactory;

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
    @FindBy(xpath = "//div[@id='msdd']")
    private WebElement languages;
    @FindBy(xpath = "//div[@class='col-md-4 col-xs-4 col-sm-4']/select[@id='Skills']")
    private WebElement skillDropList;

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

    public void  genderMale() {
         male.click();

    }
    public boolean checkSelect(){
        male.isSelected();
        return true;
    }


}
