package ders08_iframe_window;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class ders08_HW01 extends TestBase {

    //Bir class olusturun: IframeTest02
    //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
    //2) sayfadaki iframe sayısını bulunuz.
    //3) ilk iframe’deki (Youtube) play butonuna tıklayınız.
    //4) ilk iframe’den çıkıp ana sayfaya dönünüz
    //5) ikinci iframe’deki (Jmeter Made Easy) linke
    //   (https://www.guru99.com/live-selenium-project.html) tıklayınız.

    @Test
    public void iframeTest02(){
        //Bir class olusturun: IframeTest02
        //1) "http://demo.guru99.com/test/guru99home/" sitesine gidiniz.
        driver.get("http://demo.guru99.com/test/guru99home/");

        //2) sayfadaki iframe sayısını bulunuz.
        List<WebElement> frameElementsList = driver.findElements(By.xpath("//iframe"));
        System.out.println(frameElementsList.size());
        System.out.println(frameElementsList);

        //3) ilk iframe’deki (Youtube) play butonuna tıklayınız.
        WebElement iframe1= driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
        driver.switchTo().frame(iframe1);
        System.out.println(iframe1);
        wait(3);

        //driver.switchTo().frame(frameElementsList.get(0));
        driver.findElement(By.xpath("//button[@aria-label='Oynat']"))
                .click();
        wait(3);

        //4) ilk iframe’den çıkıp ana sayfaya dönünüz.
        driver.switchTo().defaultContent();

        //5) ikinci iframe’deki (Jmeter Made Easy) linke
        //   "https://www.guru99.com/live-selenium-project.html" tıklayınız.
        //driver.switchTo().frame(frameElementsList.get(1));
        WebElement iframe2= driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
        driver.switchTo().frame(iframe2);
        System.out.println(iframe2);

        driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
        wait(3);

    }

}
