package day3.Homewrok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox2 {
    // https://www.seleniumeasy.com/test/basic-checkbox-demo.html
    // Check the Multiple Checkbox and check the button message
    // When you check all the checkboxes, button message will change to 'Uncheck All'
    // When you uncheck at least one checkbox, button message will change to 'Check All'
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        List<WebElement> checkboxes = driver.findElements(By.className("cb1-element"));
        for (WebElement check : checkboxes) {
            check.click();
        }

//        WebElement message = driver.findElement(By.id("check1"));
//        WebElement message2 =driver.findElement(By.className("cb1-element"));
//        String myMessage = " Uncheck All";
//        String myMessage1 = "Check All";
//        if(message.getText().equals( myMessage )){
//            System.out.println("success!");
//        }else{
//            System.out.println("fail");
//        }
//        if(!message2.getText().equals(myMessage1)){
//            System.out.println("success!");
//        }else{
//            System.out.println("fail");
//        }

        driver.findElement(By.id("check1")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='Uncheck All']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
    }
