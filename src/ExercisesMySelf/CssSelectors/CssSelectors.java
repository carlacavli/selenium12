package ExercisesMySelf.CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");


        driver.findElement(By.cssSelector("#bmwradio")).click();
        driver.findElement(By.cssSelector("option[value='orange']")).click();
        driver.findElement(By.cssSelector("#bmwcheck")).click();
        driver.findElement(By.xpath("//input[@id='benzcheck']")).click();
        driver.findElement(By.id("openwindow")).click();

    }


    }

