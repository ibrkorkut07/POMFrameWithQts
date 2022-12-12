package tests.P1_BasicClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C4_HotelMyCampPositiveLogin {

    @Test(groups = {"miniRegression", "smoke"})
    public void pozitifLoginTesti(){
        // Bir Class olustur : PositiveTest
        // Bir test method olustur positiveLoginTest()
        // https://www.hotelmycamp.com/ adresine git
        // login butonuna bas
        //	test data username: manager ,
        //	test data password : Manager1!
        //	Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        Driver.getDriver().get("https://www.hotelmycamp.com/");

        }
    }
