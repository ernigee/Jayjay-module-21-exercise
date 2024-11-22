package seleniumTestExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class NavigationMethodTest {

    @Test
    public void navigationMethodTest() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.navigate().to("https://www.saucedemo.com/");
        driver.navigate().refresh();
        driver.navigate().to("https://www.jayjay.co");
        driver.navigate().back();

        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);

        String title = driver.getTitle();
        String currentURl = driver.getCurrentUrl();
        System.out.println("Title halaman pada web: " + title);
        System.out.println("URL saat ini adalah: " + currentURl);

    }


}
