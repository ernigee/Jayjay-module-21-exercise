import org.junit.jupiter.api.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Selenium {

    @Test
    public void helloJayJay(){
        
        // inisialisasi  browser driver
    WebDriver driver = WebDriverManager.chromedriver().create();

    //navigasi url
    driver.get("https://jayjay.co");

    //get elemen attribyt
    String text = driver.findElement(By.className("first-course")).getText();

    //assertion atau pengecekan
    assertEquals("Gebrakan kursus online yang siap meroketkan karirmu", text);

}}
