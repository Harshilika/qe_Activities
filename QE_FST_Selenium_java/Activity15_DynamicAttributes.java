package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15_DynamicAttributes {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-attributes");
        System.out.println(driver.getTitle());
        WebElement fullName=driver.findElement(By.xpath("//input[contains(@placeholder,'Full')]"));
        WebElement email=driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]"));
        WebElement dob=driver.findElement(By.xpath("//input[contains(@data-testid,'event-date')]"));
        WebElement additionalDetails=driver.findElement(By.xpath("//textarea[contains(@class,'focus')]"));
        WebElement submitBtn=driver.findElement(By.xpath("//button[contains(text(),'Sub')]"));
        fullName.sendKeys("Harshilika");
        email.sendKeys("harsh@gmail.com");
        dob.sendKeys("2003-09-14");
        additionalDetails.sendKeys("nothing");
        submitBtn.click();
      
         WebElement successMsg=driver.findElement(By.id("action-confirmation"));
         System.out.println(successMsg.getText());
         driver.quit();

    }
}

