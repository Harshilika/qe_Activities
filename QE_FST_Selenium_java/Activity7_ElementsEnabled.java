package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_ElementsEnabled {
    public static void main(String[] args) {
        
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println(driver.getTitle());
        if(driver.findElement(By.id("textInput")).isEnabled())
        {
            System.out.println("Text Input is Enabled");
        }
        else{ System.out.println("Text Input is Disabled");}
        driver.findElement(By.id("textInputButton")).click();
        if(driver.findElement(By.id("textInput")).isEnabled())
        {
            System.out.println("Text Input is Enabled");
        }
        else{ System.out.println("Text Input is Disabled");}
        driver.quit();
    }
}
