package qa_team1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Ex_04 extends TestBase {

    @Test
    public void Test(){
        //1."http://webdriveruniversity.com/IFrame/index.html" sayfasina gidin.
        driver.get("http://webdriveruniversity.com/IFrame/index.html");

        //2.“Our Products” butonuna basin.
        WebElement iframeElement=driver.findElement(By.xpath("//iframe[@id='frame']"));
        driver.switchTo().frame(iframeElement);
        WebElement ourProductsButton=driver.findElement(By.xpath("//*[text()='Our Products']"));
        ourProductsButton.click();
        wait(3);

        //3.“Cameras product”i tiklayin.
        //WebElement iframeElement2=driver.findElement(By.xpath("//iframe[@id='frame']"));
        //driver.switchTo().frame(iframeElement2);
        driver.findElement(By.xpath("//*[text()='Cameras']")).click();
        wait(3);

        //4.Popup mesajini yazdirin.
        driver.switchTo().parentFrame();
        WebElement popUpText= driver.findElement(By.xpath("//h4[@class='modal-title']"));
        //System.out.println(driver.switchTo().alert().getText());
        wait(3);

        //5.“close” butonuna basin.
        driver.switchTo().alert().accept();
        //driver.findElement(By.xpath("//*[text()='Close']")).click();
        wait(3);

        //6."WebdriverUniversity.com (IFrame)" linkini tiklayin.
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//*[text()='WebdriverUniversity.com (IFrame)']")).click();
        wait(3);

        //7."http://webdriveruniversity.com/index.html" adresine gittigini test edin.
        String expextedUrl="http://webdriveruniversity.com/index.html";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expextedUrl,actualUrl);

    }
}
