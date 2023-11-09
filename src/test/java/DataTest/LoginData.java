package DataTest;


import org.testng.annotations.DataProvider;

public class LoginData {
    @DataProvider(name = "data_provider_login1")
    public Object[][] dataIncorrectAcc() {
        return new Object[][]{
                {"sacaca@gmail.com", "123123123"},
                {"sdhasdh@gmail.com", "dasdasdasdas"}
        };
    }
    @DataProvider (name = "data_provider_login2" )
    public  Object [][] dataCorrectAcc(){
        return  new Object[][]{{"user@lavalite.org","user@lavalite" }};
    }
}
