package demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class Activity18_Alerts1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/alerts");
        System.out.println(driver.getTitle());
        WebElement simple=driver.findElement(By.id("simple"));
        simple.click();
        Thread.sleep(1000);
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        driver.quit();



    }
}
