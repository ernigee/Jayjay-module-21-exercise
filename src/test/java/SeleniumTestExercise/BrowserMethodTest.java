package SeleniumTestExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserMethodTest {

    @Test
    public void TestBrowserMethod(){
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.saucedemo.com/");

     String title = driver.getTitle();
     String currentURL = driver.getCurrentUrl();

        System.out.println("Title pada halaman web: " + title);
        System.out.println("URL yang diakses saat ini adalah: " + currentURL);
    }

    @Test
    public void saudeDemoTest() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromiumdriver().create();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input#login-button")).click();

        Thread.sleep(2000);
    }
}
