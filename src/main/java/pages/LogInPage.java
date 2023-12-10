package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

    public WebDriver driver;

    public By userNameInputField = By.id("user-name");

    public By passwordInputField = By.id("password");

    public By logInButton = By.id("login-button");

    public By errorMessage = By.xpath("//*[text()='Epic sadface: Username and password do not match any user in this service']");

    public By errorMessageDisplayedV2 = By.xpath("//*[text()='Epic sadface: Password is required']");

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String userName) {
        driver.findElement(userNameInputField).sendKeys(userName);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInputField).sendKeys(password);
    }

    public void clickOnLogInButton() {
        driver.findElement(logInButton).click();
    }

    public void uspesnoLogovanje() {
        driver.findElement(userNameInputField).sendKeys("standard_user");
        driver.findElement(passwordInputField).sendKeys("secret_sauce");
        driver.findElement(logInButton).click();
    }

    public boolean errorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
    public boolean errorMessageDisplayedV2()
    {return driver.findElement(errorMessageDisplayedV2).isDisplayed();}

}



