package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage {

    WebDriver driver;

    //1- Constructor
    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    private final By addToCart = By.cssSelector("button[data-test=\"add-to-cart-sauce-labs-backpack\"]");
    private final By cart = By.cssSelector(".shopping_cart_link");
    //.btn if csssselector by 1 class if cssselector with multiple "button[class='btn btn_primary btn_small btn_inventory']"
    private final By addtocartbutton = By.cssSelector(".btn");

    public void clickOnCart(){
        driver.findElement(cart).click();
    }
    public void clickOnAddToCart(){
        int n = 3;
        //findElements for list
        List<WebElement> addToCartButtonList = driver.findElements(addtocartbutton);
        for(int i=0; i<n; i++){
            addToCartButtonList.get(i).click();
        }
    }
}
