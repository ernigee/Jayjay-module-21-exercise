package seleniumTestExercise;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;


public class locatorTestSauceDemo {

    @Test
    public void locatorTest() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("input#user-name"));
        driver.findElement(By.xpath("//*[@id=\"password\"]"));
        driver.findElement(By.id("login-button"));

        Thread.sleep(2000);



    }
}
