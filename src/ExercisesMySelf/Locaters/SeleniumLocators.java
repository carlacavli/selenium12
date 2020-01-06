package ExercisesMySelf.Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://ultimateqa.com/blog-old/" );
        driver.manage().window().maximize();
        /*
       Locaters are ; id
                      name
                      class name
                      tag name    //not usefull especially for the finding specific one element
                      linktext - partial link text

                      id = id is always unique
                      name = not always unique

         */
        driver.findElement(By.id("searchsubmit")).click();     //id
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();

        driver. findElement(By.name("jetpack _subscriptions_widget")).click();   //name

        driver.findElement(By.className("bump-view")).click();   //class name
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();

        driver.findElements(By.tagName("input")).size();     // tag name we r finding how many elements with this tag name .

        driver.findElement(By.linkText("How to fix common Selenium errors?")).click();  // link text
        System.out.println(driver.getCurrentUrl());




    }

}
