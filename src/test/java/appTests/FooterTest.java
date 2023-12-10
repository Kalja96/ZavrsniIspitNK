package appTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;

public class FooterTest extends BaseTestsClass{

    @Test
    public void twitterDugme() throws InterruptedException {
        logInPage.uspesnoLogovanje();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(2000);
        testiranjeMreza.twitterDugme();
        Thread.sleep(2000);
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        Thread.sleep(2000);
        String expectedTwitterURL = "https://twitter.com/saucelabs";
        String actualTwitterURL = driver.getCurrentUrl();
    }

    @Test
    public void facebookDugme() throws InterruptedException {
        logInPage.uspesnoLogovanje();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(2000);
        testiranjeMreza.facebookDugme();
        Thread.sleep(2000);
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        Thread.sleep(2000);
        String expectedTwitterURL = "https://www.facebook.com/saucelabs";
        String actualTwitterURL = driver.getCurrentUrl();
    }

    @Test
    public void linkedIn() throws InterruptedException {
        logInPage.uspesnoLogovanje();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(2000);
        testiranjeMreza.linkedInDugme();
        Thread.sleep(2000);
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        Thread.sleep(2000);
        String expectedTwitterURL = "https://www.linkedin.com/company/sauce-labs/";
        String actualTwitterURL = driver.getCurrentUrl();

    }
}
