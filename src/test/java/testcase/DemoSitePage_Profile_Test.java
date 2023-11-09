package testcase;

import Help.Sleep;
import PageObject.DemoSitePage_Profile;
import TestNG.Data;
import common.DemoSiteBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoSitePage_Profile_Test extends DemoSiteBaseTest {
    @Test(dataProvider = "data_profile", dataProviderClass = DataTest.Register_Data.class)
    public void inputProfile(String firstName, String lastName, String address) {
        DemoSitePage_Profile demo = new DemoSitePage_Profile();
        demo.inputFirstName(firstName);
        demo.inputLastName(lastName);
        demo.setAddress(address);
        demo.genderMale();
        boolean checkMale = demo.checkSelect();
        if(checkMale == true){
            System.out.println("Male is selected");
        }


        Sleep.sleep(5);
    }

}
