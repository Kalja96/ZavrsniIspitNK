package appTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import pages.RemoveItem;
import pages.SuccessfulProductPurchasesPage;
import pages.SuccessfullyAddItem;

public class BaseTestsClass {

    public static WebDriver driver;

    @BeforeClass
    public static void beforeClass() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }

    @AfterClass
    public static void afterClass() throws Exception {
        driver.quit();

    }

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
    }

HomePage homePage = new HomePage(driver);
    LogInPage logInPage = new LogInPage(driver);
    SuccessfulProductPurchasesPage proveraKupovine = new SuccessfulProductPurchasesPage(driver);

    SuccessfullyAddItem dodavanjeItema = new SuccessfullyAddItem(driver);

    RemoveItem izbrisatiItem = new RemoveItem(driver);

    Footer testiranjeMreza = new Footer(driver);


















}







