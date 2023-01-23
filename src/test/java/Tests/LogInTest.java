package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @Test
    public void standardUserLogin() {

        logInPage.logIn("standard_user", "secret_sauce");

        Assert.assertTrue(driver.getCurrentUrl().contains("/inventory.html"));

        driver.navigate().refresh();

        Assert.assertTrue(driver.getCurrentUrl().contains("/inventory.html"));
    }

    @Test
    public void standardUserWrongPasswordLogin() {

        logInPage.logIn("standard_user", "12345");

        Assert.assertEquals(logInPage.getInvalidLogInMessage(), "Epic sadface: Username and password do not match any user in this service");


        Assert.assertFalse(driver.getCurrentUrl().contains("/inventory"));

        driver.navigate().refresh();

        Assert.assertFalse(driver.getCurrentUrl().contains("/inventory"));
    }

    @Test
    public void lockedOutUserLogIn() {

        logInPage.logIn("locked_out_user", "secret_sauce");

        Assert.assertEquals(logInPage.getInvalidLogInMessage(), "Epic sadface: Sorry, this user has been locked out.");

        Assert.assertFalse(driver.getCurrentUrl().contains("/inventory"));

        driver.navigate().refresh();

        Assert.assertFalse(driver.getCurrentUrl().contains("/inventory"));
    }

}
