package ders10_file_waits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import static org.junit.Assert.*;

public class Ders10_HW02 extends TestBase {

    //1.“http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin.
    //2.“Our Products” butonuna basin.
    //3.“Cameras product”i tiklayin.
    //4.Popup mesajini yazdirin.
    //5.“close” butonuna basin.
    //6."WebdriverUniversity.com (IFrame)" linkini tiklayin.
    //7."http://webdriveruniversity.com/index.html" adresine gittigini test edin.

    @Test
    public void iframeTest01(){

        //1.“http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin.
        driver.get("http://webdriveruniversity.com/IFrame/index.html");

        //2.“Our Products” butonuna basin.
        WebElement frameElement=driver.findElement(By.xpath("//iframe[@id='frame']"));
        driver.switchTo().frame(frameElement);
        WebElement ourProductButton=driver.findElement(By.xpath("//*[text()='Our Products']"));
        ourProductButton.click();
        bekle(3);

        //3.“Cameras product”i tiklayin.
        driver.findElement(By.xpath("//*[text()='Cameras']"))
                .click();
        bekle(3);

        //4.Popup mesajini yazdirin.
        WebElement popUpTex= driver.findElement(By.xpath("//div[@class='modal-body']"));
        System.out.println(popUpTex.getText());
        bekle(3);

        //5.“close” butonuna basin.
        WebElement closeButton=driver.findElement(By.xpath("//*[text()='Close']"));
        closeButton.click();
        bekle(3);

        //6."WebdriverUniversity.com (IFrame)" linkini tiklayin.
        driver.switchTo().parentFrame();
        WebElement frameLink= driver.findElement(By.xpath("//*[text()='WebdriverUniversity.com (IFrame)']"));
        frameLink.click();
        bekle(3);

        //7."http://webdriveruniversity.com/index.html" adresine gittigini test edin.
        String expectedUrl="http://webdriveruniversity.com/index.html";
        String actualUrl=driver.getCurrentUrl();
        assertEquals(expectedUrl,actualUrl);
        bekle(3);

    }
}
