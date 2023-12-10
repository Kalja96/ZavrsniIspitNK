package appTests;

import org.junit.Assert;
import org.junit.Test;

public class RemoveItem extends BaseTestsClass{

    @Test
    public void izbrisatiItem() throws InterruptedException {
        logInPage.uspesnoLogovanje();
        Thread.sleep(2000);
        dodavanjeItema.addItem();
        Thread.sleep(2000);
        dodavanjeItema.addItem2();
        Thread.sleep(2000);
        proveraKupovine.jedanKlikNaKorpu();
        Thread.sleep(2000);
        izbrisatiItem.izbrisatiItem();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        Assert.assertTrue("Item nije uklonjen", izbrisatiItem.uklonjenItem());
    }
}
