package testcase;

import Help.Sleep;
import PageObject.DemoSitePage_Profile;
import TestNG.Data;
import common.DemoSiteBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoSitePage_Profile_Test extends DemoSiteBaseTest {
    @Test(dataProvider = "data_profile", dataProviderClass = DataTest.Register_Data.class)
    public void inputProfile(String firstName, String lastName, String address,
                             String skill, String country, String year, String month, String date, String pw, String secondPW) {
        DemoSitePage_Profile demo = new DemoSitePage_Profile();
        demo.inputFirstName(firstName);
        demo.inputLastName(lastName);
        demo.setAddress(address);
        demo.genderMale();
        boolean checkMale = demo.checkSelect();
        if(checkMale == true){
            System.out.println("Male is selected");
        }
        boolean checkHobbies = demo.checkHockeyCheckBox();
        if (checkHobbies == false){
            demo.setCricketCheckBox();
        }else  {
            System.out.println("Criket don't select");
        }

        demo.setSkill(skill);
        demo.setInccorectCountry(country);
        demo.setyear(year);
        demo.setMonth(month);
        demo.setdate(date);
        demo.setPassWord(pw,secondPW);



               Sleep.sleep(5);
    }

}
