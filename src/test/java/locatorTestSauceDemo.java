import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;


public class locatorTestSauceDemo {

    @Test
    public void locatorTest(){
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("input#user-name"));
        driver.findElement(By.xpath("//*[@id=\"password\"]"));
        driver.findElement(By.id("login-button"));

    }
}
