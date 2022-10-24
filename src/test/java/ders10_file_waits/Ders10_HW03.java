package ders10_file_waits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Ders10_HW03 extends TestBase {

    //1."http://webdriveruniversity.com/" adresine gidin
    //2."Login Portal" a  kadar asagi inin.
    //3."Login Portal" a tiklayin.
    //4.Diger window'a gecin.
    //5."username" ve  "password" kutularina deger yazdirin.
    //6."login" butonuna basin.
    //7.Popup'ta cikan yazinin "validation failed" oldugunu test edin.
    //8.Ok diyerek Popup'i kapatin.
    //9.Ilk sayfaya geri donun.
    //10.Ilk sayfaya donuldugunu test edin.

    @Test
    public void Test01() throws InterruptedException {

        //1."http://webdriveruniversity.com/" adresine gidin
        driver.get("http://webdriveruniversity.com/");

        //2."Login Portal" a  kadar asagi inin.
        WebElement loginPortal = driver.findElement(By.xpath("//a[@id='login-portal']"));
        Actions action = new Actions(driver);
        action.moveToElement(loginPortal).perform();
        Thread.sleep(4000);

        //3."Login Portal" a tiklayin.
        loginPortal.click();

        //4.Diger window'a gecin.
        String[] handles = driver.getWindowHandles().toArray(new String[0]);
        driver.switchTo().window(handles[1]);

        //5."username" ve  "password" kutularina deger yazdirin.
        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        action.click(userName)
                .sendKeys("anil").sendKeys(Keys.TAB)
                .sendKeys("123456").sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform(); //6."login" butonuna basin.

        //7.Popup'ta cikan yazinin "validation failed" oldugunu test edin.
        String expected = "validation failed";
        String actual = driver.switchTo().alert().getText();
        Assert.assertEquals(expected, actual);

        //8.Ok diyerek Popup'i kapatin.
        driver.switchTo().alert().accept();

        //9.Ilk sayfaya geri donun.
        //TODO: mevcut tab nasil kapatilir, handlestan nasil isleriz.
        driver.switchTo().window(handles[0]);

        //10.Ilk sayfaya donuldugunu test edin.
        Assert.assertTrue(loginPortal.isDisplayed());

    }
}
