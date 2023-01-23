package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SidebarPage extends BasePage {

    @FindBy(id = "react-burger-menu-btn")
    private WebElement burgerMenu;
    @FindBy(id = "logout_sidebar_link")
    private WebElement buttonLogOut;



    public SidebarPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }



    public void logOut() {

        burgerMenu.click();

        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));

        buttonLogOut.click();
    }


}
