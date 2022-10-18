package Automation_Exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Ex_01 {

    // 1. Launch browser
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    @Test
    public void automationTEST(){
        //  2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        WebElement homepageGorunme= driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        Assert.assertTrue(homepageGorunme.isDisplayed());

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();

        //5. Verify 'New User Signup!' is visible
        WebElement newUserSignupElementiGorunme= driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        Assert.assertTrue(newUserSignupElementiGorunme.isDisplayed());

        //6. Enter name and email address
        WebElement nameElementi= driver.findElement(By.xpath("//input[@placeholder='Name']"));
        nameElementi.sendKeys("mehmet");
        WebElement eMailElementi= driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]"));
        eMailElementi.sendKeys("mhmt12345@gmail.com");

        //7. Click 'Signup' button
        driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccountGorunurElementi=driver.findElement(By.xpath("(//h2[@class='title text-center'])[1]"));
        Assert.assertTrue(enterAccountGorunurElementi.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        WebElement passwordElementi= driver.findElement(By.xpath("//input[@id='password']"));
        passwordElementi.sendKeys("123456");

        WebElement birtDayElementi=driver.findElement(By.xpath("//select[@data-qa='days']"));
        Select select=new Select(birtDayElementi);
        select.selectByValue("1");

        WebElement birtMonthElementi=driver.findElement(By.xpath("//select[@id='months']"));
        Select select1=new Select(birtMonthElementi);
        select1.selectByValue("3");

        WebElement birtYearElementi=driver.findElement(By.xpath("//select[@id='years']"));
        Select select2=new Select(birtYearElementi);
        select2.selectByValue("2000");

        //10. Select checkbox 'Sign up for our newsletter!'
        WebElement signUpDugmesi=driver.findElement(By.xpath("//input[@id='newsletter']"));
        signUpDugmesi.click();

        // 11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//input[@id='optin']")).click();

        // 12. Fill details: First name, Last name, Company,
        // Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement firstName= driver.findElement(By.xpath("//input[@id='first_name']"));
        passwordElementi.sendKeys("mehmet" + Keys.ENTER);

        WebElement lastName= driver.findElement(By.xpath("//input[@id='last_name']"));
        passwordElementi.sendKeys("ali" + Keys.ENTER);

        WebElement company= driver.findElement(By.xpath("//input[@id='company']"));
        passwordElementi.sendKeys("Wise Quarter" + Keys.ENTER);

        WebElement address= driver.findElement(By.xpath("//input[@id='address1']"));
        passwordElementi.sendKeys("123 Royal Street, LA 38070, USA  " + Keys.ENTER);

        WebElement address2= driver.findElement(By.xpath("//input[@id='address2']"));
        passwordElementi.sendKeys("New Orleans USA" + Keys.ENTER);

        WebElement selectCountryRadioButton=driver.findElement(By.xpath("//option[@value='United States']"));
        select.selectByValue("United States");

        WebElement state= driver.findElement(By.xpath("//input[@id='last_name']"));
        passwordElementi.sendKeys("ali" + Keys.ENTER);
        WebElement city= driver.findElement(By.xpath("//input[@id='last_name']"));
        passwordElementi.sendKeys("ali" + Keys.ENTER);
        WebElement Zipcode= driver.findElement(By.xpath("//input[@id='last_name']"));
        passwordElementi.sendKeys("ali" + Keys.ENTER);
        WebElement mobileNumber= driver.findElement(By.xpath("//input[@id='last_name']"));
        passwordElementi.sendKeys("ali" + Keys.ENTER);

        //13. Click 'Create Account button'

        //14. Verify that 'ACCOUNT CREATED!' is visible

        //15. Click 'Continue' button

        //16. Verify that 'Logged in as username' is visible

        //17. Click 'Delete Account' button

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }
    @After
    public void teardown(){
        //  driver.close();
    }

}
