package demos;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.By;
public class Activity10_DragDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/drag-drop");
        System.out.println(driver.getTitle());
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement ball = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ball")));
    WebElement dropzone1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropzone1")));
    WebElement dropzone2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropzone2")));
    Thread.sleep(2000);
    Actions actions=new Actions(driver);
    actions.dragAndDrop(ball, dropzone1).perform();
    WebElement dropped1=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div[1]/span"));
    if(dropped1.getText().equals("Dropped!"))
      {
        System.out.println("ball is dropped in dropzone1");
      }
     WebElement dropped2=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div[2]/span"));
      actions.dragAndDrop(ball, dropzone2).perform();

      if(dropped2.getText().equals("Dropped!"))
      {
        System.out.println("ball is dropped in dropzone2");
      }
    driver.quit();
    }


    
}
