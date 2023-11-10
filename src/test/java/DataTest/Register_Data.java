package DataTest;

import org.testng.annotations.DataProvider;

public class Register_Data {
    @DataProvider (name= "data_profile")
    public Object[][] profile1() {
            return new Object[][]{{"Le Minh", "Khanh", "482 TNV", "Android", "a"}};
    }
}
