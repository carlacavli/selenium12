package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

       // driver.findElement(By.id("cookie-use-link")).click();
       // driver.findElement(By.linkText("cookie-use-link")).click(); bu calismadi
       // driver.findElement(By.linkText("Data Policy")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.close();  // for parent window
        driver.quit();   // for  parent & child window


    }
}
