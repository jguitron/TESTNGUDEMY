package TEST;

import org.testng.annotations.*;

public class day3 {
    //rahulonlinetutor@gmail.com
    @BeforeClass
    public void beforeClass () {
        System.out.println("before executing any methods in the class");
    }

    @Parameters({"URL", "username"})
    @Test
    public void WebloginHomeLoan (String urlname, String Key)
    {
        //selenium
        System.out.println("WebloginHome");
        System.out.println(urlname);
        System.out.println(Key);
    }

     @Test(timeOut = 3000)
     public void MobileloginHomeLoan ()
     {
         //Appium
         System.out.println("MobileloginHome");
     }
     @Test(dataProvider = "getData")
     public void MobilesignoutLoan (String username, String password)
     {
         //Appium
         System.out.println("MobileloginHome");
         System.out.println(username);
         System.out.println(password);
     }

     @BeforeMethod
     public void beforeEvery ()
     {
         System.out.println("I will execute before every test method in day 3 class");
     }
     @AfterMethod
     public void afterEvery ()
     {
         System.out.println("I will execute after every test method in day 3 class");
     }

     @AfterClass
     public void afterClass ()
     {
         System.out.println("after executing all the methods in the class");
     }

     @BeforeSuite
     public void BFsuite () {
         System.out.println("I am number one");
     }

     @Test(groups ={"Smoke"})
     public void MobilesigninLoan ()
     {
         //Appium
         System.out.println("MobileloginHome");
     }

    @Test (dependsOnMethods = {"MobilesigninLoan"})
    public void APIHomeLoan ()
    {
        //REST API automation
        System.out.println("WebloginCa");

    }

    @DataProvider
    public Object[][] getData () {
        Object [][] data = new Object[3][2];
        //1st combination - username password - good credit history = row
        //2nd username password - no credit history
        //3rd fradulent credit history

        //first set
        data[0][0]= "firstsetusername";
        data[0][1]= "password";
        //columns in the row are noting but values for that particular combination(row)

        //2nd set
        data[1][0]="secondsetusername";
        data[1][1]= "seoncdpassword";

        //3rd set
        data[2][0]="thridsetusername";
        data[2][1]="thridpassword";
        return data;
    }
}
