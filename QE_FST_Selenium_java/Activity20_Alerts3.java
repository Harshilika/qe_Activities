
package demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class Activity20_Alerts3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/alerts");
        System.out.println(driver.getTitle());
        WebElement prompt=driver.findElement(By.id("prompt"));
        prompt.click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Awesome!");
        Thread.sleep(1000);
        alert.accept();
         System.out.println(driver.findElement(By.id("result")).getText());
        driver.quit();

    }
}
