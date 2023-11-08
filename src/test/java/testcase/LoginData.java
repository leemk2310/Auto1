package testcase;


import org.testng.annotations.DataProvider;

public class LoginData {
    @DataProvider(name = "data_provider_login1")
    public Object[][] dataIncorrectAcc() {
        return new Object[][]{
                {"sacaca@gmail.com", "123123123", "These credentials do not match our records."},
                {"sdhasdh@gmail.com", "dasdasdasdas", "These credentials do not match our records."}
        };
    }
    @DataProvider (name = "data_provider_login2" )
    public  Object [][] dataCorrectAcc(){
        return  new Object[][]{{"user@lavalite.org ","user@lavalite", "Welcome, User!" }};
    }
}
