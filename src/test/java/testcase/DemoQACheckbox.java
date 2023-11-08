package testcase;

import PageObject.DemoQAPage;
import common.DemoQATest;
import org.testng.annotations.Test;

public class DemoQACheckbox extends DemoQATest {
    @Test
    public  void TestQA() throws InterruptedException {
        DemoQAPage demoQAPage = new DemoQAPage(driver);
        demoQAPage.OpenMenu();
       // demoQAPage.CloseMenu();
        demoQAPage.ClickHomeCheckBox();




    }




}
