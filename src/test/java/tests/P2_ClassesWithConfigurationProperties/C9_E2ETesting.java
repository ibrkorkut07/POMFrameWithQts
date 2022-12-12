package tests.P2_ClassesWithConfigurationProperties;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C9_E2ETesting {

    // 1. Tests packagenin altına class olusturun: CreateHotel
    // 2. Bir metod olusturun: createHotel
    // 3. https://www.hotelmycamp.com adresine git.
    // 4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
    //	  a. Username : manager
    //	  b. Password  : Manager1!
    // 5. Login butonuna tıklayın.
    // 6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
    // 7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
    // 8. Save butonuna tıklayın.
    //    hotelMyCampPage.addHotelSaveButonu.click();
    // 9. “Hotel was inserted successfully” textinin göründüğünü test edin.
    // 10. OK butonuna tıklayın.

    @Test
    public void createHotel() throws InterruptedException {

        // 3. https://www.hotelmycamp.com adresine gidin
        HotelMyCampPage hmc = new HotelMyCampPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hmc.advancedButton.click();
        hmc.proceedLink.click();
        hmc.FirstLoginButton.click();

        // 4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
        //	  a. Username : manager
        //	  b. Password  : Manager1!

        // 5. Login butonuna tıklayın.

        // 6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin

        // 7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.


        // 8. Save butonuna tıklayın.

        // hmc.saveOKButton.click();
        //    hotelMyCampPage.addHotelSaveButonu.click();
        // 9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        // 10. OK butonuna tıklayın.
    }
}
