package ders09_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.security.Key;

public class ders09_HW02 extends TestBase {

    //1- Bir Class olusturalim KeyboardActions2
    //2- https://html.com/tags/iframe/ sayfasina gidelim
    //3- video’yu gorecek kadar asagi inin
    //4- videoyu izlemek icin Play tusuna basin
    //5- videoyu calistirdiginizi test edin

    @Test
    public void ders09_HW02Test(){

        //1- Bir Class olusturalim KeyboardActions2
        //2- "https://html.com/tags/iframe/" sayfasina gidelim.
        driver.get("https://html.com/tags/iframe/");
        wait(3);

        //3- video’yu gorecek kadar asagi inin.
        Actions actions= new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        wait(3);

        //4- videoyu izlemek icin Play tusuna basin.
        //Play tuşuna basabilmek için öncelikle videonun old.
        //iframe'e driverimizi geçirmemiz gerekir.
        WebElement iframe= driver.findElement(By.xpath
                ("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(iframe);

        WebElement videoPlayButton=
                driver.findElement(By.xpath
                        ("//button[@aria-label='Oynat']"));

        actions.click(videoPlayButton).perform();
        //videoPlayButton.click();
        wait(10);

        //5- videoyu calistirdiginizi test edin.
        //actions.click(videoPlayButton).perform();
        //Video play butonu, play tuşuna bastıktan sonra kaybolur.
        //driver tekrar çalıştıramaz.Böylece video çalıştığı test edilir.
        Assert.assertFalse(videoPlayButton.isDisplayed());

    }

}
