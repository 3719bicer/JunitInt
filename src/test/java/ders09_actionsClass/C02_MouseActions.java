package ders09_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.Set;

import static org.junit.Assert.*;

public class C02_MouseActions extends TestBase{

    //1- Yeni bir class olusturalim: MouseActions2
    //2- https://the-internet.herokuapp.com/context_menu sitesine gidelim
    //3- Cizili alan uzerinde sag click yapalim
    //4- Alert’te cikan yazinin “You selected a context menu” oldugunu
    //   test edelim.
    //5- Tamam diyerek alert’i kapatalim
    //6- Elemental Selenium linkine tiklayalim
    //7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim

    @Test
    public void TestMouseAction01() throws InterruptedException {

        //1- Yeni bir class olusturalim: MouseActions2.
        //2- "https://the-internet.herokuapp.com/context_menu" sitesine gidelim.
        driver.get("https://the-internet.herokuapp.com/context_menu");
        wait(3);
        //3- Cizili alan uzerinde sag click yapalim.
        Actions actions=new Actions(driver);
        WebElement cizgiliAlanClick= driver.findElement(
                By.xpath("//div[@id='hot-spot']"));
        System.out.println("" + cizgiliAlanClick);

        actions.contextClick(cizgiliAlanClick).perform();
        wait(3);

        //4- Alert’te cikan yazinin “You selected a context menu” oldugunu
        //   test edelim.
        System.out.println("Alert text : " + driver.switchTo().alert().getText());
        wait(3);

        String expAlertText="You selected a context menu";
        String actAlertText=driver.switchTo().alert().getText();

        assertEquals(expAlertText,actAlertText);
        wait(3);

        //5- Tamam diyerek alert’i kapatalim.
        driver.switchTo().alert().accept();
        wait(3);
        //System.out.println("1.Sayfa Handle Degeri : "+ driver.getWindowHandle());

        //6- Elemental Selenium linkine tiklayalim.
        driver.findElement(By.linkText("Elemental Selenium")).click();
        wait(5);
        //Link tıklayarak bir sayfaya gidiyorsak driver otomatik olarak o sayfaya GİTMEZ.

        //7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim.
        // once driver'i 2.sayfaya gecirmeliyiz,
        // bunun icin de 2.sayfanin handle degerini bulmaliyiz.
        Set<String> handleDegerlerSeti=driver.getWindowHandles();
        String ikinciSayfaWindowsHandleDegeri="";

        for (String eachHandleDeger:handleDegerlerSeti
             ) {
            if(!handleDegerlerSeti.equals(ikinciSayfaWindowsHandleDegeri)){
                ikinciSayfaWindowsHandleDegeri=eachHandleDeger;
            }
        }
        //System.out.println("2.Sayfa Handle Degeri : "+ikinciSayfaWindowsHandleDegeri);
        driver.switchTo().window(ikinciSayfaWindowsHandleDegeri);

        WebElement h1TagName=driver.findElement(By.tagName("h1"));
        String expTagYazı="Elemental Selenium";
        String actTagYazı=h1TagName.getText();
        Assert.assertEquals(expTagYazı,actTagYazı);
        wait(3);


        /*//1- Yeni bir class olusturalim: MouseActions1
        //2- https://the-internet.herokuapp.com/context_menu sitesine gidelim
        driver.get("https://the-internet.herokuapp.com/context_menu");

        //3- Cizili alan uzerinde sag click yapalim
        Actions actions= new Actions(driver);
        WebElement cizgiliAlanElementi= driver.findElement(By.id("hot-spot"));
        actions.contextClick(cizgiliAlanElementi).perform();
        Thread.sleep(3000);

        //4- Alert’te cikan yazinin “You selected a context menu” oldugunu
        //    test edelim.
        String expectedAlertYazisi="You selected a context menu";
        String actualAlertYazisi= driver.switchTo()
                                        .alert()
                                        .getText();
        Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);
        Thread.sleep(3000);

        //5- Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();

        //6- Elemental Selenium linkine tiklayalim
        //String ilkSayfahandleDegeri= driver.getWindowHandle();
        //System.out.println("1.Sayfa HANDLE degeri :" + ilkSayfahandleDegeri);
        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();

        //7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim
        // once driver'i 2.sayfaya gecirmeliyiz,
        // bunun icin de 2.sayfanin handle degerini bulmaliyiz.

        Set<String > handleDegerlerSeti= driver.getWindowHandles();
        String ikinciSayfaHandleDegeri="";

        for (String eachHandleDegeri: handleDegerlerSeti) {
            if (!eachHandleDegeri.equals(ilkSayfahandleDegeri)){
                ikinciSayfaHandleDegeri=eachHandleDegeri;
            }
        }
        driver.switchTo().window(ikinciSayfaHandleDegeri);

        WebElement h1TagElementi= driver.findElement(By.tagName("h1"));
        String expectedTagYazisi="Elemental Selenium";
        String actualTagYazisi= h1TagElementi.getText();
        Assert.assertEquals(expectedTagYazisi,actualTagYazisi);
        Thread.sleep(5000);*/

        /*
        ● Bazen bir butona tıkladığımızda, başka bir sekmede(tab) yeni bir pencere açılır.
        ● Birden fazla pencereyle calişirken driver’a pencereler arasında gecis yaptirmamiz gerekir.
        ● Pencereler arasında gecis yapmak icin window handle degerini kullaniriz.
        ● window handle : Selenium WebDriver’in,
          WebDriver objesi başlatıldığında her pencereye verdigi unique alfanumerik kimlik degeridir.
        10:40
        Handle Windows Method’lari;
        1 ) Icinde oldugumuz sayfanin window handle degerini alma
        driver.getWindowHandle();
        2 ) Pencereler arasında geçiş yapma(switch)
        3 ) Yeni tab olusturup geçiş yapma(switch)
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().window(sayfa1HandleDegeri);
        4 ) Yeni window olusturup geçiş yapma(switch)
        driver.switchTo().newWindow(WindowType.WINDOW);
        */

    }
}


