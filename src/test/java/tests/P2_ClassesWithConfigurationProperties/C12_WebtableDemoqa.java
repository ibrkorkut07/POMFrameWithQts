package tests.P2_ClassesWithConfigurationProperties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.annotations.Test;
import pages.DemoqaPage;
import pages.HMCWebTablePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class C12_WebtableDemoqa {

    //  1. “https://demoqa.com/webtables” sayfasina gidin
    //  2. Headers da bulunan department isimlerini yazdirin
    //  3. 3.sutunun basligini yazdirin
    //  4. Tablodaki tum datalari yazdirin
    //  5. Tabloda kac cell (data) oldugunu yazdirin
    //  6. Tablodaki satir sayisini yazdirin
    //  7. Tablodaki sutun sayisini yazdirin

    //  8. Tablodaki 3.kolonu yazdirin
    //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
    // 10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin

    DemoqaPage demoqaPage;

    @Test(groups = {"smoke","regression"})
    public void demoqaTest(){

        demoqaPage = new DemoqaPage();
        //  1. “https://demoqa.com/webtables” sayfasina gidin

        //  2. Headers da bulunan department isimlerini yazdirin

        //   //div[@class='rt-thead -header']
        //  normalde //thead//th olurdu ancak bu tablo class isimleri ile organize edilmis

        // ikinci yontem olarak basliklari bir listeye koyabilirim
        // basliklarWebelementiListesi

        //  3. 3.sutunun basligini yazdirin

        //  4. Tablodaki tum datalari yazdirin

        //  5. Tabloda kac cell (data) oldugunu yazdirin

        //  6. Tablodaki satir sayisini yazdirin


        //  7. Tablodaki sutun sayisini yazdirin
        //     farkli yollardan hesaplanabilir ama biz hucre sayisi / satir sayisi yapalim

        //  8. Tablodaki 3.kolonu yazdirin


        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin

        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin


        Driver.closeDriver();

    }



}
