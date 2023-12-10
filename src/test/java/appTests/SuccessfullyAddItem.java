package appTests;

import org.junit.Assert;
import org.junit.Test;

public class SuccessfullyAddItem extends BaseTestsClass {
    @Test
    public void dodavanjeItema() throws InterruptedException {
        logInPage.uspesnoLogovanje();
        Thread.sleep(2000);
        dodavanjeItema.addItem();
        Thread.sleep(2000);
        dodavanjeItema.addItem2();
        Thread.sleep(2000);
        proveraKupovine.jedanKlikNaKorpu();
        Thread.sleep(2000);
        Assert.assertTrue("Item nije dodat", dodavanjeItema.deskripcijaProizvoda());
    }

}
