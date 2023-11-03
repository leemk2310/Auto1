package TestNG;

import org.testng.annotations.DataProvider;

public class Data {
    @DataProvider (name = "data_fullname_input" )

    public Object [][] dataFullName  (){

        return  new Object[][] {{"le Minh Khanh" },{"lm Khanh"}};
    }
//    @DataProvider (name = "data_email_input", parallel = true)
//    public  Object [][] dataEmail (){
//        return  new Object[][] {{"saku@gmai.com", "sacaca@gmail.com"}};
//    }

}
