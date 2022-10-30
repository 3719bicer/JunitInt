package ders12_Excell;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.*;

public class C02_ReadExcell {
    //7. Dosya yolunu bir String degiskene atayalim
    //8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
    //9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
    //10. WorkbookFactory.create(fileInputStream)
    //11. Worksheet objesi olusturun workbook.getSheetAt(index)
    //12. Row objesi olusturun sheet.getRow(index)
    //13. Cell objesi olusturun row.getCell(index)

    @Test
    public void ReadExcellTest() throws IOException {

        //7. Dosya yolunu bir String degiskene atayalim.
        String dosyaYolu=System.getProperty("user.home")+"\\Desktop\\ulkeler.xlsx";


        //8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim.
        FileInputStream fis=new FileInputStream(dosyaYolu);

        //9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim.
        //10. WorkbookFactory.create(fileInputStream).
        Workbook workbook= WorkbookFactory.create(fis);

        //11. Worksheet objesi olusturun workbook.getSheetAt(index).
        Sheet sheet= workbook.getSheet("Sayfa1");

        //12. Row objesi olusturun sheet.getRow(index).
        Row row=sheet.getRow(13);

        //13. Cell objesi olusturun row.getCell(index).
        Cell cell=row.getCell(2);
        System.out.println(cell); //Arnavutluk

        //14. 14.Satırdaki ülkenin türkcesinin "Bahreyn" oldugunu test edin.
        String expIsim="Bahreyn";
        String actIsim=cell.toString();
        assertEquals(expIsim,actIsim);

    }
}
