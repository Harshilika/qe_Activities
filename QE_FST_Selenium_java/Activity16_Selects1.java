package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
public class Activity16_Selects1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects");
        System.out.println(driver.getTitle());
        WebElement dropdown=driver.findElement(By.tagName("select"));
        Select select=new Select(dropdown);
        select.selectByVisibleText("Two");
        Thread.sleep(2000);
        select.selectByIndex(3);
        Thread.sleep(2000);
        select.selectByValue("four");
        Thread.sleep(2000);
        List<WebElement> options=select.getOptions();
        for(WebElement val:options)
        {
            System.out.println(val.getText());;
        }
        driver.quit();
    }
}
