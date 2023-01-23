package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutTest extends BaseTest {


    @Test
    public void logOutTest() {       //thread.sleep koristim da bih ispratila sta se desava pri pokretanju testa

        logInPage.logIn("standard_user", "secret_sauce");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        sidebarPage.logOut();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");

        driver.navigate().refresh();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");


        driver.get("https://www.saucedemo.com/inventory.html");

        Assert.assertEquals(logInPage.getInvalidLogInMessage(), "Epic sadface: You can only access '/inventory.html' when you are logged in.");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


}
