package Tests;

import Pages.InventoryPage;
import Pages.LogInPage;
import Pages.SidebarPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait driverWait;
    protected LogInPage logInPage;
    protected InventoryPage inventoryPage;
    protected SidebarPage sidebarPage;


    @BeforeClass
    public void beforeClass() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ina\\Desktop\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        logInPage = new LogInPage(driver, driverWait);
        inventoryPage = new InventoryPage(driver, driverWait);
        sidebarPage = new SidebarPage(driver, driverWait);
    }


    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://www.saucedemo.com/");
    }



    @AfterClass
    public void afterClass() {
        driver.quit();
    }


}
