package ders10_file_waits;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Ders10_HW02 extends TestBase {

    //1.“http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin.
    //2.“Our Products” butonuna basin.
    //3.“Cameras product”i tiklayin.
    //4.Popup mesajini yazdirin.
    //5.“close” butonuna basin.
    //6."WebdriverUniversity.com (IFrame)" linkini tiklayin.
    //7."http://webdriveruniversity.com/index.html" adresine gittigini test edin.

    @Test
    public void Test(){
        //1."http://webdriveruniversity.com/IFrame/index.html" sayfasina gidin.
        driver.get("http://webdriveruniversity.com/IFrame/index.html");

        //2.“Our Products” butonuna basin.
        WebElement iframeElement=driver.findElement(By.xpath("//iframe[@id='frame']"));
        driver.switchTo().frame(iframeElement);
        WebElement ourProductsButton=driver.findElement(By.xpath("//*[text()='Our Products']"));
        bekle(3000);

        //3.“Cameras product”i tiklayin.
        WebElement camerasProductButtun= driver.findElement(By.xpath("//p[text()='Cameras']"));

        bekle(3000);

        //4.Popup mesajini yazdirin.
        System.out.println(driver.switchTo().alert().getText());
        bekle(3000);

        //5.“close” butonuna basin.
        driver.switchTo().alert().accept();
        bekle(3000);

        //6."WebdriverUniversity.com (IFrame)" linkini tiklayin.

        //7."http://webdriveruniversity.com/index.html" adresine gittigini test edin.

    }
}
