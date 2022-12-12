package tests.smokeTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class NegativeLoginTest {

    // 1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
    //    3 Farkli test Methodunda 3 senaryoyu test et
    //	    - yanlisSifre
    //		- yanlisKulllanici
    //		- yanlisSifreKullanici
    //    test data yanlis username: manager1 , yanlis password : manager1
    // 2) https://www.hotelmycamp.com adresine git
    // 3) Login butonuna bas
    // 4) Verilen senaryolar ile giris yapilamadigini test et

    HotelMyCampPage hotelMyCampPage;

    @Test
    public void wrongPasswordTest() throws IOException {

    }

    @Test
    public void wrongUsernameTest() throws IOException {

    }

    @Test
    public void wrongPasswordWrongUsernameTest() throws IOException {

    }

}
