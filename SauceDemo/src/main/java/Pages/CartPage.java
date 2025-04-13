package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    //1- Constructor
    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    private final By checkoutButton = By.cssSelector("button[data-test=\"add-to-cart-sauce-labs-backpack\"]");

}
