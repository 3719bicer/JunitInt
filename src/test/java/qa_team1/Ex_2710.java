package qa_team1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import static org.junit.Assert.*;

public class Ex_2710 extends TestBase {
//    1. Launch browser
//    2. Navigate to url 'http://automationexercise.com'
//    3. Verify that home page is visible successfully
//    4. Add products to cart
//    5. Click 'Cart' button
//    6. Verify that cart page is displayed
//    7. Click Proceed To Checkout
//    8. Click 'Register / Login' button
//    9. Fill all details in Signup and create account
//    10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
//    11. Verify ' Logged in as username' at top
//    12.Click 'Cart' button
//    13. Click 'Proceed To Checkout' button
//    14. Verify Address Details and Review Your Order
//    15. Enter description in comment text area and click 'Place Order'
//    16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
//    17. Click 'Pay and Confirm Order' button
//    18. Verify success message 'Your order has been placed successfully!'
//    19. Click 'Delete Account' button
//    20. Verify 'ACCOUNT DELETED!' and click 'Continue' button.

    @Test
    public void HomePageIsVisible() {
        //    1. Launch browser.
        //    2. Navigate to url 'http://automationexercise.com'.
        driver.get("http://automationexercise.com");

        //    3. Verify that home page is visible successfully.
        System.out.println(driver.getTitle());
        String expTitle = "Automation Exercise";
        String actTitle = driver.getTitle();
        assertEquals(expTitle, actTitle);

        //    4. Add products to cart.

        //    5. Click 'Cart' button.
        driver.findElement(By.linkText("//*[text()=' Cart']"));
        //    6. Verify that cart page is displayed.
        System.out.println(driver.getTitle());
        String expCartPageTitle = "Automation Exercise";
        String actCartPageTitle = driver.getTitle();
        assertEquals(expCartPageTitle, actCartPageTitle);


        //    7. Click Proceed To Checkout
        //    8. Click 'Register / Login' button
        //    9. Fill all details in Signup and create account
        //    10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        //    11. Verify ' Logged in as username' at top
        //    12.Click 'Cart' button
        //    13. Click 'Proceed To Checkout' button
        //    14. Verify Address Details and Review Your Order
        //    15. Enter description in comment text area and click 'Place Order'
        //    16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        //    17. Click 'Pay and Confirm Order' button
        //    18. Verify success message 'Your order has been placed successfully!'
        //    19. Click 'Delete Account' button
        //    20. Verify 'ACCOUNT DELETED!' and click 'Continue' button.


    }
}
