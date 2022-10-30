package ders12_Excell;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_FizikiKullanilanSatirSayisi {

    @Test
    public void Test01() throws IOException {

        // ulkeler excelindeki Sayfa2'de fiziki olarak kullanilan satir sayisinin
        // 15 oldugunu test edin
        String dosyaYolu=System.getProperty("user.home")+"\\Desktop\\ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);

        int toplamSatirSayisi= workbook.getSheet("Sayfa2").getLastRowNum();

        // index kullandigi icin satir sayisini bulmak icin 1 ekleyelim
        System.out.println("Toplam satir sayisi : " + (toplamSatirSayisi+1));
        int fizikiKullanilanSatirsayisi= workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();
        System.out.println("Fiziki kullanilan satir sayisi : " + fizikiKullanilanSatirsayisi);


    }
}
