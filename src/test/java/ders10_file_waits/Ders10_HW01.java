package ders10_file_waits;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Ders10_HW01 extends TestBase {

    //1. "http://webdriveruniversity.com/Actions" sayfasina gidin.
    //2. "Hover over Me First" kutusunun ustune gelin.
    //3. "Link 1" e tiklayin.
    //4. Popup mesajini yazdirin.
    //5. Popup'i tamam diyerek kapatin.
    //6. "Click and hold" kutusuna basili tutun.
    //7. "Click and hold" kutusunda cikan yaziyi yazdirin.
    //8. "Double click me" butonunu cift tiklayin.

    @Test
    public void Test() {
        //  1. "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        //  2. "Hover over Me First" kutusunun ustune gelin
        WebElement firstHover = driver.findElement(By.xpath("//button[@class='dropbtn']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(firstHover).perform();

        //  3. "Link 1" e tiklayin
        WebElement link1 = driver.findElement(By.xpath("//a[@class='list-alert']"));
        link1.click();

        //  4. Popup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());

        //  5. Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();

        //  6. "Click and hold" kutusuna basili tutun
        WebElement clickBox = driver.findElement(By.id("click-box"));
        actions.moveToElement(clickBox).clickAndHold().perform();

        //  7. "Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(clickBox.getText());

        //  8. "Double click me" butonunu cift tiklayin
        WebElement doubleClick = driver.findElement(By.id("double-click"));
        actions.moveToElement(doubleClick).doubleClick().perform();
    }
}
