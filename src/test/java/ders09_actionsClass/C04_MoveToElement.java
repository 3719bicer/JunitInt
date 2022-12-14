package ders09_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C04_MoveToElement extends TestBase {

    //   Yeni bir class olusturalim: MouseActions3
    //1- "https://www.amazon.com/" adresine gidelim.
    //2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin
    //   mouse’u bu menunun ustune getirelim.
    //3- “Create a list” butonuna basalim.
    //4- Acilan sayfada “Your Lists” yazisinin oldugunu test edelim.

    @Test
    public void Test01() throws InterruptedException {
        driver.get("https://www.amazon.com/");

        WebElement accountListElement=
                driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));

        Actions actions= new Actions(driver);
        actions.moveToElement(accountListElement).perform();
        wait(3);

        WebElement createListButton=
                driver.findElement(By.xpath("//span[text()='Create a List']"));

        createListButton.click();
        wait(3);

        WebElement yourListYaziElemnti=
                driver.findElement(By.xpath("//div[@role='heading']"));
        System.out.println(yourListYaziElemnti.getText());
        wait(3);
        String expYourListYazisi="Your Lists";
        String actYourListYazisi=yourListYaziElemnti.getText();
        //Assert.assertEquals(expYourListYazisi,actYourListYazisi);
        wait(3);

        Assert.assertTrue(yourListYaziElemnti.isDisplayed());


//        //Yeni bir class olusturalim: MouseActions3
//
//        //1- https://www.amazon.com/ adresine gidelim
//        driver.get("https://www.amazon.com/");
//
//        //2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin
//        //   mouse’u bu menunun ustune getirelim
//        WebElement accountListsElementi= driver.findElement(By.xpath("//*[text()='Account & Lists']"));
//        Actions actions= new Actions(driver);
//        actions.moveToElement(accountListsElementi).perform();
//
//
//        //3- “Create a list” butonuna basalim.
//        driver.findElement(By.xpath("//span[text()='Create a List']")).click();
//
//        //4- Acilan sayfada “Your Lists” yazisi oldugunu test edelim.
//        WebElement yourListElement= driver.findElement(By.id("my-lists-tab"));
//        Assert.assertTrue(yourListElement.isDisplayed());
//        Thread.sleep(5000);
    }
}
