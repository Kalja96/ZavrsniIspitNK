package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulProductPurchasesPage {
    public WebDriver driver;

    public By klikNaKorpa = By.xpath("//a[@class='shopping_cart_link']");

    public By checkOut = By.id("checkout");


    public By firstNameInputField = By.id("first-name");

    public By lastNameInputField = By.id("last-name");

    public By zipCodeInputField = By.id("postal-code");

    public By continuePress = By.id("continue");

    public By finish = By.id("finish");

    public By backDugme = By.id("back-to-products");

    public SuccessfulProductPurchasesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void jedanKlikNaKorpu() {
        driver.findElement(klikNaKorpa).click();
    }

    public void checkOut() {
        driver.findElement(checkOut).click();
    }


    public void enterFirstName(String firstName) {
        driver.findElement(firstNameInputField).sendKeys();
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameInputField).sendKeys();
    }

    public void enterZipCode(String zipCode) {
        driver.findElement(zipCodeInputField).sendKeys();
    }

    public void clickOnContinue(String continuePress) {
        driver.findElement(By.id(continuePress)).click();
    }

    public void uspesnoPopunjeniPodaci() {
        driver.findElement(firstNameInputField).sendKeys("Nikola");
        driver.findElement(lastNameInputField).sendKeys("Kaljevic");
        driver.findElement(zipCodeInputField).sendKeys("11221");
        driver.findElement(continuePress).click();

    }

    public void zavrsenaKupovina() {
        driver.findElement(finish).click();
    }
public boolean dugmePrikazano(){
        return driver.findElement(backDugme).isDisplayed();
}
}
