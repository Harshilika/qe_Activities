package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity11_waits1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        //Actions actions=new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println(driver.getTitle());
        By checkbox = By.id("checkbox");
        WebElement ToggleButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/main/div/div/div/div/div[2]/section[1]/button")));
        ToggleButton.click();
        //WebElement ToggleButton=driver.findElement(By.xpath(""));
        //actions.click(ToggleButton).perform();;
       wait.until(ExpectedConditions.invisibilityOfElementLocated(checkbox));
       System.out.println("Checkbox is removed (not visible).");
       ToggleButton.click();
        WebElement cb = wait.until(ExpectedConditions.visibilityOfElementLocated(checkbox));
        System.out.println("Checkbox is visible again.");
cb.click();
        driver.quit();


    }
}
