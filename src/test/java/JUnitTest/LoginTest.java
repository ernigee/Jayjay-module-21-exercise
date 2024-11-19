package JUnitTest;

import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginTest {

    @Test
    public void loginTest(){
        //inisiasi webdriver
        WebDriver driver = WebDriverManager.chromedriver().create();

// inisialisasi page object
        LoginPage loginPage= new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");

        //action test

        loginPage.inputUserName("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();

        //testValidation
        homePage.validationBackPackDisplay();
    }
}
