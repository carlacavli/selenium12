package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "file:///Users/muberracavli/IdeaProjects/selenium12/src/day3/resources/form.html");


        WebElement text = driver.findElement( By.name( "text" ) );
        text.sendKeys( "This is my text" );
        WebElement webElement = driver.findElement( By.name( "password" ) );
        webElement.sendKeys( "Password" );
        WebElement textarea = driver.findElement( By.name( "textarea" ) );
        textarea.sendKeys( "Some text Area words" );
        WebElement checkbox = driver.findElement( By.name( "checkbox" ) );
        checkbox.click();
        List<WebElement> radio = driver.findElements( By.name( "radio" ) );
        WebElement secondElementOfRadio = radio.get(1 );// [0, 1, 2].click
        secondElementOfRadio.click();
        WebElement select = driver.findElement(By.name("select"));
        //select for dropdown
        Select dropdown= new Select(select);
        //dropdown.deselectByIndex(1);
        List<WebElement> options=dropdown.getOptions();
        for(WebElement element :options){
            if (element.getText().equals("Option 4"));
            dropdown.selectByVisibleText("Option 4");
        }
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
       String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);   // altta cikan mai yaziyi bu methodla buliyoruz



        }

// close the drive and associated windows
      //  driver.quit();
    }

