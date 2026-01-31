package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8_InputEvents {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver=new FirefoxDriver();
        Actions actions=new Actions(driver);
        driver.get("https://training-support.net/webelements/mouse-events");
        System.out.println(driver.getTitle());
        //CLICK ON CARGO.LOCK BUTTON
        WebElement cargoLock=driver.findElement(By.xpath("//*[@id=\"stage\"]/div/div[1]/div/h1"));
        actions.click(cargoLock).perform();
        System.out.println(driver.findElement(By.xpath("//*[@id='result']")).getText());
        Thread.sleep(1000);
        //MOVE CURSOR TO CARGO.TML AND CLICK
        WebElement toml=driver.findElement(By.xpath("//*[@id=\"stage\"]/div/div[2]/div/h1"));
        actions.moveToElement(toml).click().perform();
        System.out.println(driver.findElement(By.xpath("//*[@id='result']")).getText());
        //DOUBLE CLICK ON SRC BUTTON
        WebElement srcbutton=driver.findElement(By.xpath("//*[@id=\"stage\"]/div/div[3]/div/h1"));
        Thread.sleep(1000);
        actions.doubleClick(srcbutton).perform();
        System.out.println(driver.findElement(By.xpath("//*[@id='result']")).getText());
        Thread.sleep(1000);
        //RIGHT CLICK ON TARGET BUTTON
        WebElement targetbutton=driver.findElement(By.xpath("//*[@id=\"stage\"]/div[1]/div[4]/div/h1"));
        actions.contextClick(targetbutton).perform();
        Thread.sleep(1000);
        //SELECT OPEN BUTTON 
        WebElement openbutton=driver.findElement(By.xpath("//span[text()='Open']"));
       openbutton.click(); 
       System.out.println(driver.findElement(By.xpath("//*[@id=\"result\"]")).getText());
       Thread.sleep(1000);
       driver.quit();
    }
}





