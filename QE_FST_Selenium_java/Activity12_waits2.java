package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_waits2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-content");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
By messageLocator = By.id("word");
           
wait.until(ExpectedConditions.textToBePresentInElementLocated(
        messageLocator, "release"
));
            String text=driver.findElement(messageLocator).getText();
            System.out.println("The result is:"+text);
            driver.quit();


    }
}
