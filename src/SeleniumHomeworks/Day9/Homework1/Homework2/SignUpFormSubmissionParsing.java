package SeleniumHomeworks.Day9.Homework1.Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class SignUpFormSubmissionParsing {
    /**
     * open SignUpForm.html
     * fill in your data inside the all input elements
     * submit the form
     * get URL
     * parse values that was submitted and print them out
     * hint: https://examples.javacodegeeks.com/core-java/net/url/parse-url-example/
     * like nameOfTheInput = valueOfTheInput
     */
    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        System.setProperty("webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/muberracavli/IdeaProjects/selenium12/src/Day9/Homework1/SignUpForm.html");

        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("j.smith");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("1234qwe");

        WebElement repeatPassword = driver.findElement(By.name("passwordRpt"));
        repeatPassword.sendKeys("1234qwe");

        WebElement address = driver.findElement(By.name("address"));
        address.sendKeys("1234 Nirvana Ct" + "\n" + "Some city, USA 00000");

        List<WebElement> gender = driver.findElements(By.name("sex"));
        gender.get(0).click();

        WebElement plan = driver.findElement(By.name("plan"));
        Select p = new Select(plan);
        int planSize = driver.findElements(By.tagName("option")).size();
        for (int i = 0; i < planSize; i++) {
            Thread.sleep(1000);
            p.selectByIndex(i);
        }

        WebElement agree = driver.findElement(By.name("agreement"));
        agree.click();

        Thread.sleep(5000);

        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();
        String url = driver.getCurrentUrl();
        parseUrl(driver, url);

        Thread.sleep(2000);
        driver.quit();
    }

    private static void parseUrl(WebDriver driver, String url) throws MalformedURLException {
        URL myUrl = new URL(url);
        String sentKeys = myUrl.getQuery();
        for (String str: sentKeys.split("&")) {
            System.out.println(str);
        }
    }
}
