package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToRemoveFromCartTest extends BaseTest {


    @Test
    public void addToCart() {

        logInPage.logIn("standard_user", "secret_sauce");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        inventoryPage.addToCart();

        Assert.assertEquals (inventoryPage.getCartBadge(), "1");
    }


    @Test
    public void removeProduct() {

        logInPage.logIn("standard_user", "secret_sauce");

        inventoryPage.addToCart();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        inventoryPage.removeFromCart();

        Assert.assertTrue (inventoryPage.getCart().isEmpty());
    }








}
