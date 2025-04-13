package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*
 1- to search from console to make sure that xpath is unique >$x("//*[@id='password' and @name='password']")
 */
public class LoginPage {
    //1- Constructor
    //2- Locators
    //3- Public action methods

    WebDriver driver;

    //1- Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // i need it just here and i don't need anyone to change it
    private final By username = By.xpath("//input[@id='user-name' and @name='user-name']");
    // * = any tag name
    private final By password = By.xpath("//*[@id='password' and @name='password']");
    private final By loginButton = By.xpath("//input[@id='login-button' and @name='login-button']");

    //3- Public action methods
    public void enterUsername(String username){

        driver.findElement(this.username).sendKeys(username);
    }
    public void enterPassword(String password){

        driver.findElement(this.password).sendKeys(password);
    }
    public void clickOnLoginButton(){

        driver.findElement(loginButton).click();
    }

}
