package day3.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingElementsOnPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/muberracavli/IdeaProjects/selenium12/src/day3/day5.resources/form.html");

        List<String> list = Arrays.asList( "h1", "h2", "h3", "p", "input", "option", "br", "select" );
        List<String> tagsForTesting = new ArrayList<>( list );
        tagsForTesting.add( "form" );
        for(String tag : tagsForTesting) {
            printNumberOfElementsOnAPage( driver, tag );
        }


//        List<WebElement> elements = driver.findElements(By.tagName("h1"));
//        System.out.println("there is" + elements.size() + "h1 tags on page");
//
//        elements = driver.findElements(By.tagName("h2"));
//        System.out.println("there is" + elements.size() + "h2 tags on page");
//
//        elements = driver.findElements(By.tagName("p"));
//        System.out.println("there is" + elements.size() + "p tags on page");
            // tk tek yazmak yerine method yaziyoruz
        }




    private static void printNumberOfElementsOnAPage(WebDriver driver, String tag) {  // this is method
        List<WebElement> elements = driver.findElements(By.tagName(tag));
        System.out.println("There is(are) " + elements.size() + " " + tag + " tag(s) on page!");
    }
}