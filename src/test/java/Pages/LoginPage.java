package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By usernameInputText = By.cssSelector("input#user-name");
    By passwordInputText = By.cssSelector("input#password");
    By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver= driver;
    };

    public void inputUserName (String username){
        driver.findElement(usernameInputText).sendKeys(username);
    }

    public void inputPassword (String password){
        driver.findElement(passwordInputText).sendKeys(password);
    }

    public void clickLoginButton (){
        driver.findElement(loginButton).click();
    }



}