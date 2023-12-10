package appTests;

import org.junit.Assert;
import org.junit.Test;

public class LogInTests extends BaseTestsClass{

    @Test
    public void validLogInAction() {
        logInPage.uspesnoLogovanje();
        Assert.assertTrue("Nije uspesno izvedeno logovanje", homePage.addToCartButtonPresent());
        Assert.assertTrue("Nije uspesno izvedeno logovanje", homePage.productImgIsPresent());
    }

    @Test
    public void validUserNameInvalidPassword() {
        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("abcfdef");
        logInPage.clickOnLogInButton();
        Assert.assertTrue("Nije izasla ERROR poruka", logInPage.errorMessageDisplayed());
    }

    @Test
    public void validPasswordInvalidUserName() {
        logInPage.enterPassword("secret_sauce");
        logInPage.enterUserName("asdsadasd");
        logInPage.clickOnLogInButton();
        Assert.assertTrue("Nije izasla ERROR poruka", logInPage.errorMessageDisplayed());
    }

    @Test
    public void invalidUserNameInvalidPassword() {
        logInPage.enterUserName("adsadasda");
        logInPage.enterPassword("fadsadsad");
        logInPage.clickOnLogInButton();
        Assert.assertTrue("Nije izasla ERROR poruka", logInPage.errorMessageDisplayed());
    }

    @Test
    public void emptyPassword() throws InterruptedException {
        logInPage.enterUserName("secret_sauce");
        logInPage.enterPassword("");
        logInPage.clickOnLogInButton();
        Thread.sleep(2000);
        Assert.assertTrue("Nije izasla ERROR poruka", logInPage.errorMessageDisplayedV2());
    }
}
