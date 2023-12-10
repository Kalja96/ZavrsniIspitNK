package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfullyAddItem {

    public WebDriver driver;

    public By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");

    public By addToCartButton2 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");

    public By deskripcija = By.xpath("//div[@class='cart_desc_label']");

    public SuccessfullyAddItem(WebDriver driver){
        this.driver = driver;
    }

    public void addItem(){
        driver.findElement(addToCartButton).click();
    }

    public void addItem2(){
        driver.findElement(addToCartButton2).click();
    }

public boolean deskripcijaProizvoda(){
        return driver.findElement(deskripcija).isDisplayed();
}






}
