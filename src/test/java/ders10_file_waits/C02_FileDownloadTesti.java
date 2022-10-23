package ders10_file_waits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_FileDownloadTesti extends TestBase {

    //1. Tests packagenin altina bir class oluşturalim : C04_FileDownload.
    //2. "https://the-internet.herokuapp.com/download" adresine gidelim.
    //3. code.txt dosyasını indirelim.
    //4. Dosyanın başarıyla indirilip indirilmediğini test edelim.

    @Test
    public void Test01(){

        //Tests packagenin altina bir class oluşturun : C05_UploadFile
        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        //chooseFile butonuna basalim
        //Yuklemek istediginiz dosyayi secelim.
        WebElement dosyaSecButonu= driver.findElement(By.id("file-upload"));

        /*
          dosya sec butonuna bastiktan sonra
          bilgisayardan selenium ile dosya secmemiz mumkun degil
          onun yerine
          dosyaSecButonu.sendKeys("DosyaYolu") yaparsak
          dosya secme islemi yapilmis olacaktir
         */

        String yuklenecekDosyaYolu= System.getProperty("user.home") +
                "/Desktop/FileTesti/deneme.txt";

        //    "/Users/ahmetbulutluoz/Desktop/FileTesti/deneme.txt"
        dosyaSecButonu.sendKeys(yuklenecekDosyaYolu);
        bekle(5);

        //Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();

        //“File Uploaded!” textinin goruntulendigini test edelim.
        bekle(5);
        WebElement fileUploadYazielementi= driver.findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadYazielementi.isDisplayed());
    }
}
