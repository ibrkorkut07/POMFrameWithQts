package tests.P1_BasicClasses;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;


import java.util.concurrent.locks.AbstractOwnableSynchronizer;

    public class C2_PageFirstClass {

        // Amazon'a gidelim
        // arama kutusuna Nutella yazip aratalim
        // Atama sonuclarinin Nutella / Java icerdigini test edelim

        // POM'de farkli class'lara farkli sekilde ulasilmasi benimsenmistir
        // Driver class'i icin static yontemi kullaniyoruz
        // Page Class'lari icin ise obje uzerinden kullanilmasi tercih edilmistir
        @Test
        public void test01(){
            // Amazon'a gidelim
            Driver.getDriver().get("https://www.amazon.com");
            // arama kutusuna Nutella yazip aratalim

            // Atama sonuclarinin Nutella icerdigini test edelim

        }

        @Test(groups = {"miniRegression","smoke"})
        public void test02() {
            // amazona gidelim
            Driver.getDriver().get("https://www.amazon.com");
            //java icin arama yapalim

            // sonucun java icerdigini test edelim

        }
    }



