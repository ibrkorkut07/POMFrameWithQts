package tests.P2_ClassesWithConfigurationProperties;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C11_WebtableDynamicLocate {
    // 3 test method'u olusturalim
    // 1) method satir numarasi verdigimde bana o satirdaki datalari yazdirsin
    // 2) method satir no ve data numarasi girdigimde verdigim datayi yazdirsin
    // 3) sutun numarasi verdigimde bana tum sutunu yazdirsin

    @Test
    public void writeRowTest(){

      // 1) method satir numarasi verdigimde bana o satirdaki datalari yazdirsin

        // 2.satiri yazdir  //tbody//tr[2]
        // 7.satiri yazdir //tbody//tr[7]


    }

    @Test
    public void writeCellTest(){

        // 2) method satir no ve data numarasi girdigimde verdigim datayi yazdirsin

        // 2.satirin 4.datasi   //tbody//tr[2]//td[4]
        // 4.satirin 5.datasi   //tbody//tr[4]//td[5]


    }

    @Test
    public void writeColomnTest(){

        // 3) sutun numarasi verdigimde bana tum sutunu yazdirsin

    }
}
