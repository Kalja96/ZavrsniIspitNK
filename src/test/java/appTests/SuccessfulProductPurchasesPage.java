package appTests;

import org.junit.Assert;
import org.junit.Test;

public class SuccessfulProductPurchasesPage extends BaseTestsClass{

    @Test
    public void uspesnaKupovina() throws InterruptedException {
        logInPage.uspesnoLogovanje();
        Thread.sleep(2000);
        proveraKupovine.jedanKlikNaKorpu();
        Thread.sleep(2000);
        proveraKupovine.checkOut();
        Thread.sleep(2000);
        proveraKupovine.uspesnoPopunjeniPodaci();
        Thread.sleep(2000);
        proveraKupovine.zavrsenaKupovina();
        Thread.sleep(1000);
        Assert.assertTrue("Kupovina nije uspela", proveraKupovine.dugmePrikazano());





    }
}

