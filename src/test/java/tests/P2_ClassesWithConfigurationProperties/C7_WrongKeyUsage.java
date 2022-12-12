package tests.P2_ClassesWithConfigurationProperties;

import org.testng.annotations.Test;
import utilities.Driver;

public class C7_WrongKeyUsage {

    @Test
    public void test01(){

        // eger key olarak girdigimiz String configuration.properties dosyasinda yoksa
        // Ornegin : HMCUrl yerine HMCurl yazarsak,
        // ConfigReader.getProperty() o key'i bulamaz
        // ve nullPointerException firlatir
    }
}