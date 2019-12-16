package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        String title = driver.getTitle();
        System.out.println("title is: " + title);
        System.out.println("url is : " +driver.getCurrentUrl());
        WebElement we = driver.findElement(By.id("email"));
        System.out.println(we.getAttribute("id"));
        System.out.println(we.getTagName());



    }
}
