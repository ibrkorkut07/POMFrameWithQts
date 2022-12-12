package tests.P2_ClassesWithConfigurationProperties;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

import java.util.List;

public class C10_Webtables {
    @Test
    public void loginT(){
        // Bir class oluşturun : C02_WebTables
        // login( ) metodun oluşturun ve oturum açın.
        // https://www.hotelmycamp.com/admin/HotelRoomAdmin adresine gidin
        //      Username : manager
        //		Password : Manager1!
        // table metodu oluşturun
        // Tüm table body’sinin boyutunu(sutun sayisi ) bulun. /tbody
        // Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        // printRows metodu oluşturun //tr
        // table body’sinde bulunan toplam satir(row) sayısını bulun.
        // Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        // 4.satirdaki(row) elementleri konsolda yazdırın.
    }

    @Test (dependsOnMethods = "loginT")
    public void table(){
        //● table( ) metodu oluşturun
        //			○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        // header kisminda birinci satir ve altindaki datalari locate edelim
        //   //thead//tr[1]//th

        //			○ Table’daki tum body’i ve başlıkları(headers) konsolda yazdırın.
        //       //tbody


        // Eger body'yi tek bir webelement olarak locate edersek
        // icindeki tum datalari getText() ile yazdirabiliriz
        // ancak bu durumda bu elementler ayri ayri degil,
        // body'nin icindeki tek bir String'in parcalari olurlar
        // dolayisiyla bu elementlere tek tek ulasmamiz mumkun olmaz
        // sadece contains method'u ile body'de olup olmadiklarini test edebiliriz.

        // eger her bir datayi ayri ayri almak istersek
        //  //tbody//td seklinde locate edip bir list'e atabiliriz


    }


    @Test (dependsOnMethods = "loginT")
    public void printRows(){
        //● printRows( ) metodu oluşturun //tr
        //			○ table body’sinde bulunan toplam satir(row) sayısını bulun.
        // //tbody//tr


        //			○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.


    }
}
