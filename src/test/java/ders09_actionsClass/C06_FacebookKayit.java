package ders09_actionsClass;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C06_FacebookKayit extends TestBase {

    //1- https://www.facebook.com adresine gidelim
    //2- Yeni hesap olustur butonuna basalim
    //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
    //4- Kaydol tusuna basalim

    @Test
    public void FacebookKayıtTest(){
        //1- "https://www.facebook.com" adresine gidelim.
        driver.get("https://www.facebook.com");

        //2- Yeni hesap olustur butonuna basalim.
        WebElement yeniHesapOlusturButton= driver.findElement(By.linkText("Yeni Hesap Oluştur"));
        yeniHesapOlusturButton.click();
        wait(3);

        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim.
        WebElement nameButton=
                driver.findElement(By.xpath("//input[@name='firstname']"));
        wait(3);
        Actions actions= new Actions(driver);
        Faker faker=new Faker();
        String mail=faker.internet().emailAddress();
        String name=faker.name().firstName();
        System.out.println(mail);
        System.out.println(name);

        wait(3);
        actions.click(nameButton)
                .sendKeys("Mehmet Ali")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys("maöbulut@mail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("123456").perform();
        wait(5);
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("01")
                .sendKeys(Keys.TAB)
                .sendKeys("Kas")
                .sendKeys(Keys.TAB)
                .sendKeys("1999")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        wait(10);

        //4- Kaydol tusuna basalim


    }

}
