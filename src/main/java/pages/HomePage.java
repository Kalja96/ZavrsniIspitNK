package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

public WebDriver driver;

public By productImg = By.className("inventory_item_img");

public By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
public HomePage(WebDriver driver) {
        this.driver = driver;
    }

 public boolean productImgIsPresent(){
    return driver.findElement(productImg).isDisplayed();

 }
public boolean addToCartButtonPresent(){
    return driver.findElement(addToCartButton).isDisplayed();
}




}
