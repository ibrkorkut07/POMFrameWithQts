package tests.P1_BasicClasses;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class C3_FacebookLogin {

    // https://www.facebook.com/ adresine gidin
    // POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
    // Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
    // Basarili giris yapilamadigini test edin

    @Test
    public void test() throws IOException {
        // https://www.facebook.com/ adresine gidin

        // POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        // Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin

        // Basarili giris yapilamadigini test edin

        // TakesScreenshot ts = (TakesScreenshot) driver;
        // File fullPhoto = new File("target/screenShot/fullPage.jpeg");
        // File temporaryPhoto = ts.getScreenshotAs(OutputType.FILE);
        // FileUtils.copyFile(temporaryPhoto, fullPhoto);
    }
}
