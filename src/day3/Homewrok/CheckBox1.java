package day3.Homewrok;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox1 {
    // https://www.seleniumeasy.com/test/basic-checkbox-demo.html
    // Check the Single Checkbox and check the message bellow it
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
//        Thread.sleep( 1000 );
//        WebElement chbox = driver.findElement(By.id("isAgeSelected"));
//        chbox.click();
//
//        if(chbox.isSelected()){
//            chbox.click();
//        }


        WebElement checkbox = driver.findElement( By.id( "isAgeSelected" ) );
        checkbox.click();

        WebElement message = driver.findElement( By.id( "txtAge" ) );
        String myMessage = "Success - Check box is checked";

        if(message.getText().equals( myMessage )){
            System.out.println("Success!");
        } else {
            System.out.println("Failure!");
        }
    }

    }

