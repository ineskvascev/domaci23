package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage extends BasePage {

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement buttonAddtoCart;
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement buttonRemove;
    @FindBy(className = "shopping_cart_link")
    private WebElement cart;
    @FindBy(className = "shopping_cart_badge")
    private WebElement cartBadge;



    public InventoryPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }




    public void addToCart() {
        buttonAddtoCart.click();
    }

    public void removeFromCart() {
        buttonRemove.click();
    }

    public String getCart() {
        return cart.getText();
    }

    public String getCartBadge() {
        return cartBadge.getText();
    }


}
