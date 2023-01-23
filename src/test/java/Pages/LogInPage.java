package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement inputUsername;
    @FindBy(id = "password")
    private WebElement inputPassword;
    @FindBy(id = "login-button")
    private WebElement buttonLogin;
    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    private WebElement invalidLogInMessage;



    public LogInPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }



    public void logIn(String username, String password) {
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        buttonLogin.click();
    }


    public String getInvalidLogInMessage() {
        return invalidLogInMessage.getText();
    }



}
