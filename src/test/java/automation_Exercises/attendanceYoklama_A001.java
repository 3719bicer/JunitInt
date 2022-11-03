package automation_Exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import java.time.Duration;

public class attendanceYoklama_A001 extends TestBase {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void Test1() throws InterruptedException {
        /*
       1-yoklama sitesine gidelim.
       2-bizden istenen bilgilerden ilk olarak ad soyad girisi yapalim.
       3-Mail(kayit olurken verdiginiz mail) kismina bilgilerimizi girelim.
       4-Derse Katildim kisminda uygun olan isaretlemeyi yapalim.
       5-tum bilgileri tamamladiktan sonra gonder butonuna tiklayalim.
       6-Sayfayi Kapatalim.
         */

        driver.get("https://docs.google.com/forms/d/e/1FAIpQLSd5_I3e-wir0s68TFyY3Cj3Th4vjusJ4xv1aUET0Y4i-sY9cQ/viewform");
        Thread.sleep(1000);
        WebElement adSoyad=driver.findElement(By.xpath("//input[@type=\"text\"][1]"));
        adSoyad.sendKeys("Veli Biçer");
        wait(1);

        WebElement mail= driver.findElement(By.xpath("//input[@aria-labelledby='i5']"));
        mail.sendKeys("vvelibicerr@gmail.com");
        wait(1);

        WebElement derseKatildim=driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1'][1]"));
        derseKatildim.click();
        wait(1);

        WebElement gonder= driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div[1]/div/span/span"));
        gonder.click();
        wait(1);

        WebElement yoklamaSonuc= driver.findElement(
                By.xpath("//div[@class='vHW8K']"));
        System.out.println("Yoklama durumu : " + yoklamaSonuc.getText());
        wait(1);
    }

    @After
    public void TearDown(){
        driver.quit();
    }
}
