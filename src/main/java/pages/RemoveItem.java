package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveItem {

    public WebDriver driver;

    public By removeItem = By.id("remove-sauce-labs-backpack");

    public By removeItem2 = By.id("remove-sauce-labs-bolt-t-shirt");

    public By daLiJeIzbrisanItem = By.xpath("//*[@class='shopping_cart_link']");


    public RemoveItem(WebDriver driver) {
        this.driver = driver;
    }

    public void izbrisatiItem(){
        driver.findElement(removeItem).click();
    }

    public void izbrisatiItem2(){
        driver.findElement(removeItem2).click();
    }
public boolean uklonjenItem(){
        return driver.findElement(daLiJeIzbrisanItem).isDisplayed();
}

}
