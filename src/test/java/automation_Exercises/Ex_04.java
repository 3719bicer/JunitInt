package automation_Exercises;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Ex_04 extends TestBase {

    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click on 'Signup / Login' button
    //5. Verify 'Login to your account' is visible
    //6. Enter correct email address and password
    //7. Click 'login' button
    //8. Verify that 'Logged in as username' is visible
    //9. Click 'Logout' button
    //10. Verify that user is navigated to login page

    @Test
    public void test01_HomePage(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement webSayfaLogosu = driver.findElement(By.xpath("//div[@class='logo pull-left']"));
        Assert.assertTrue(webSayfaLogosu.isDisplayed());
    }

    @Test
    public void test02_LoginToYourAccountIsVisible(){
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();

        //5. Verify 'Login to your account' is visible
        WebElement LoginToYourAccount = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(LoginToYourAccount.isDisplayed());
    }

    @Test
    public void test03_LoggedInAsUsernameIsVisible(){
        //6. Enter correct email address and password
        WebElement incorrectEmail = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        incorrectEmail.sendKeys("mj@g.com");
        WebElement incorrectPassword = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        incorrectPassword.sendKeys("123456");

        //7. Click 'login' button
        WebElement clickLogin = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        clickLogin.click();

        //8. Verify that 'Logged in as username' is visible
        WebElement LoggedInAsUsername = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
    }

    @Test
    public void test04_NavigatedToLoginPage(){
        //9. Click 'Logout' button
        driver.findElement(By.xpath(" //a[@href='/logout']")).click();

        //10. Verify that user is navigated to login page
        WebElement LoginToYourAccount = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(LoginToYourAccount.isDisplayed());
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}
