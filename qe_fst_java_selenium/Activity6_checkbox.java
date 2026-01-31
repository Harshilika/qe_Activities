package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6_checkbox {
    public static void main(String[] args) {
        
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println(driver.getTitle());
        if(driver.findElement(By.id("checkbox")).isSelected())
        {

            System.out.println("checkbox is selected");
        }
        else{System.out.println("checkbox not selected");}
        driver.findElement(By.id("checkbox")).click();
        if(driver.findElement(By.id("checkbox")).isSelected())
        {

            System.out.println("checkbox is selected");
        }
        else{System.out.println("checkbox not selected");}
        driver.quit();
    }
}
