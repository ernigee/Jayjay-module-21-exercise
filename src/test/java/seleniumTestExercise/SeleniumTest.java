package seleniumTestExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {
    @Test
    public void helloJayJay(){

        // inisialisasi  browser driver
        WebDriver driver = WebDriverManager.chromedriver().create();

        //navigasi url
        driver.get("https://jayjay.co/");

        //get elemen attribute
        String text;
        text = By.xpath("/html/body/div[3]/section[1]/div/div/div/div/div[2]/h1").findElement(driver).getText();

        //assertion atau pengecekan
        assertEquals("Belajar dari para ahli terbaik\n" +
                "berdasarkan program Eropa", text);

    }
}
