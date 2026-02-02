package demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class Activity19_Alerts2 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/alerts");
        System.out.println(driver.getTitle());
        WebElement confirm=driver.findElement(By.id("confirmation"));
        confirm.click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        System.out.println(driver.findElement(By.id("result")).getText());
        confirm.click();
        driver.switchTo().alert();
        alert.dismiss();
        System.out.println(driver.findElement(By.id("result")).getText());
        driver.quit();
    }
}
