package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17_Selects2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects");
        System.out.println(driver.getTitle());
        WebElement dropdown=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/section/div[2]/select"));
        Select select=new Select(dropdown);
        select.selectByVisibleText("HTML");
        Thread.sleep(2000);
        select.selectByIndex(4);
        Thread.sleep(2000);
        select.selectByIndex(5);
        Thread.sleep(2000);
        select.selectByIndex(6);
        Thread.sleep(2000);
        select.selectByValue("nodejs");
        Thread.sleep(2000);
        select.deselectByIndex(5);
        Thread.sleep(2000);
        driver.quit();
    }
}
