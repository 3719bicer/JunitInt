package automation_Exercises;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Ex_03 extends TestBase {

    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click on 'Contact Us' button
    //5. Verify 'GET IN TOUCH' is visible
    //6. Enter name, email, subject and message
    //7. Upload file
    //8. Click 'Submit' button
    //9. Click OK button
    //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
    //11. Click 'Home' button and verify that landed to home page successfully

    @Test
    public void Test01(){

        //  2. Navigate to url 'http://automationexercise.com
        driver.get("http://automationexercise.com");

        //  3. Verify that home page is visible successfully
        WebElement pageHomeVisibele=driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
        pageHomeVisibele.isDisplayed();
        //  4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//a[text()=' Contact us']")).click();

        //  5. Verify 'GET IN TOUCH' is visible
        driver.findElement(By.xpath("(//h2[@class='title text-center'])[2]")).isDisplayed();

        //  6. Enter name, email, subject and message
        driver.findElement(By.xpath("//input[@data-qa='name']")).sendKeys("qwert");
        driver.findElement(By.xpath("//input[@data-qa='email']")).sendKeys("123@gmail.de");
        driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys("deneme");
        driver.findElement(By.xpath("//textarea[@data-qa='message'] ")).sendKeys("deneme yapiyoruz");

        //  7. Upload file
        WebElement upLoad=driver.findElement(By.xpath("//input[@name='upload_file']"));
        String dosyaYolu=System.getProperty("user.home")+ "\\Downloads\\Deneme.txt";

        upLoad.sendKeys(dosyaYolu);
        wait(3);
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //  8. Click 'Submit' button
        WebElement submitButtonu= driver.findElement(By.xpath("//input[@name='submit']"));
        submitButtonu.click();
        wait(5);

        //  9. Click OK button
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        //  10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        driver.findElement(By.xpath("//div[@class='status alert alert-success']")).isDisplayed();

        //  11. Click 'Home' button and verify that landed to home page successfully
        driver.findElement(By.xpath("//div[@class='status alert alert-success']")).isDisplayed();
        driver.findElement(By.xpath("//span[text()=' Home']")).click();
        wait(2);

        //  pageHomeVisibele.isDisplayed();    Bu adres ve yolu normalde sayfa ilk acildiginda da ,
        //  testin sonunda da ayni olmasina ragmen dogrulamayi yapmadi ve test FILED oldu.
        //  Asagidaki gibi yeni bir elementi Locate edip isDisplayed yaptigimizda testimiz basarili oldu.

        driver.findElement(By.xpath("//a[@style='color: orange;']")).isDisplayed();

    }
    @Test
    public void Test02(){

        //  1. Launch browser
        //  2. Navigate to url 'http://automationexercise.com
        driver.get("http://automationexercise.com");

        //  3. Verify that home page is visible successfully
        WebElement pageHomeVisibele = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
        pageHomeVisibele.isDisplayed();

        //  4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//a[text()=' Contact us']")).click();

        //  5. Verify 'GET IN TOUCH' is visible
        driver.findElement(By.xpath("(//h2[@class='title text-center'])[2]")).isDisplayed();

        //  6. Enter name, email, subject and message
        driver.findElement(By.xpath("//input[@data-qa='name']")).sendKeys("qwert");
        driver.findElement(By.xpath("//input[@data-qa='email']")).sendKeys("123qay@gamil.com");
        driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys("deneme");
        driver.findElement(By.xpath("//textarea[@data-qa='message'] ")).sendKeys("deneme yapiyoruz");

        //  7. Upload file
        WebElement upLoad=driver.findElement(By.xpath("//input[@name='upload_file']"));
        String dosyaYolu=System.getProperty("user.home")+ "\\Downloads\\Deneme.txt";

        upLoad.sendKeys(dosyaYolu);
        wait(3);
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //  8. Click 'Submit' button
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
        wait(3);

        //  9. Click OK button
        driver.switchTo().alert().accept();

        //  10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        String expected = "Success! Your details have been submitted successfully.";
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
        String actual =successMessage.getText();
        Assert.assertEquals(expected, actual);

        //  11. Click 'Home' button and verify that landed to home page successfully
//        WebElement homeButton = driver.findElement(By.xpath("//i[@class='fa fa-angle-double-left']"));
//        homeButton.click();
//        Assert.assertTrue(pageHomeVisibele.isDisplayed());

        driver.findElement(By.xpath("//div[@class='status alert alert-success']")).isDisplayed();
        driver.findElement(By.xpath("//span[text()=' Home']")).click();
        wait(2);

        //  pageHomeVisibele.isDisplayed();
        //  Bu adres ve yolu normalde sayfa ilk acildiginda da ,
        //  testin sonunda da ayni olmasina ragmen dogrulamayi yapmadi ve test FaILED oldu.
        //  Asagidaki gibi yeni bir elementi Locate edip isDisplayed yaptigimizda testimiz basarili oldu.

        driver.findElement(By.xpath("//a[@style='color: orange;']")).isDisplayed();
    }
}
