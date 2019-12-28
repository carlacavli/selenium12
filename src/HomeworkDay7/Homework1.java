package HomeworkDay7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    // repeat Task 3 for all the buttons. Success, warning, danger and info buttons.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html" );

        driver.findElement( By.id( "normal-btn-success" ) ).click();
        WebElement message = driver.findElement( By.cssSelector( ".alert-normal-success" ) );
        WebElement button = driver.findElement( By.cssSelector( ".alert-normal-success > button" ) );
        String text = message.getText().replace( button.getText(), "" ).trim();
        String test = "I'm a normal success message. To close use the appropriate button.";
        // ternary expression!
        System.out.println( test.equals( text ) ? "Success!" : "Failure!" );

        button.click();
        System.out.println( !message.isDisplayed() ? "Success!" : "Failure" );
        driver.quit();
    }
}

