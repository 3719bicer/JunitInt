package ders09_actionsClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class ders09_HW01 extends TestBase {

    //Yeni Class olusturun ActionsClassHomeWork
    //1- “http://webdriveruniversity.com/Actions” sayfasina gidin
    //2- Hover over Me First” kutusunun ustune gelin
    //3- Link 1" e tiklayin
    //4- Popup mesajini yazdirin
    //5- Popup’i tamam diyerek kapatin
    //6- “Click and hold” kutusuna basili tutun
    //7-“Click and hold” kutusunda cikan yaziyi yazdirin
    //8- “Double click me” butonunu cift tiklayin

    @Test
    public void Test01(){
        //1- “http://webdriveruniversity.com/Actions” sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        //2- "Hover over Me First" kutusunun ustune gelin.
        WebElement first=driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
        wait(5);

        //3- Link 1" e tiklayin
        Actions actions= new Actions(driver);
        actions.moveToElement(first).click();
        wait(5);

        //4- Popup mesajini yazdirin
        //5- Popup’i tamam diyerek kapatin
        //6- “Click and hold” kutusuna basili tutun
        //7-“Click and hold” kutusunda cikan yaziyi yazdirin
        //8- “Double click me” butonunu cift tiklayin

    }
}
