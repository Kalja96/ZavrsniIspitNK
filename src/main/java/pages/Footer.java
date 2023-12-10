package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Footer {

    public WebDriver driver;

    public By twitter = By.xpath("//a[@href='https://twitter.com/saucelabs']");

    public By facebook = By.xpath("//a[@href='https://www.facebook.com/saucelabs']");

    public By linkedIn = By.xpath("//a[@href='https://www.linkedin.com/company/sauce-labs/']");

    public Footer(WebDriver driver) {
        this.driver = driver;
    }

    public void twitterDugme(){
        driver.findElement(twitter).click();
    }

    public void facebookDugme(){
        driver.findElement(facebook).click();
    }

    public void linkedInDugme(){
        driver.findElement(linkedIn).click();}





}
