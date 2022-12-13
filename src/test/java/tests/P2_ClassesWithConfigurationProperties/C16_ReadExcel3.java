package tests.P2_ClassesWithConfigurationProperties;

import org.apache.poi.ss.usermodel.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C16_ReadExcel3 {

    @Test
    public void test01() throws IOException {


        // Biz FIS ile okudugumuz excel dosyasini projemiz icerisnde kullanabilmek icin
        // Apachi POI depenceny yardimi ile bir Workbook olusturduk

        // Bu workbook bizim projemizin icerinde ulkeler excelinin bir kopyasini kullanmamizi sagliyor

        // Excelin yapisi geregi bir hucreye(Cell) ulasabilmek icin workbookdan baslayarak
        // sirasiyla sheet, row ve cell objeleri olusturmamiz gerekiyor


        // indexi 4 olan satirdaki, indexi 2 olan hucrenin Andorra oldugunu test ediniz

        //5.indexdeki satirin, 3.indexdeki hucre bilgisini yazdiralim

    }

    @Test
    public void test02() {

        // 1.satirdaki 2.hucreye gidelim ve yazdiralim
        // 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
        // 2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
        // Satir sayisini bulalim
        // Fiziki olarak kullanilan satir sayisini bulun
        // Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim
    }
}
