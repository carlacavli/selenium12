package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTest {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

       WebElement we =driver.findElement(By.id("email"));
       we.sendKeys("abs@gmail.com");

       driver.findElement(By.name("pass")).sendKeys("test");
       driver.findElement(By.id("loginbutton")).click();
    }
}