package demos;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestActivity9
 {
    private WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void setup()
    {
        driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/alerts");
    }
    @BeforeMethod
    public void switchDefault()
    {
        driver.switchTo().defaultContent();
    }
   @Test
   public void simpleAlertCase()
   {
        WebElement simplebtn=driver.findElement(By.id("simple"));
        simplebtn.click();
        Alert alert=driver.switchTo().alert();
          System.out.println(alert.getText());
          
        alert.accept();
        WebElement msg=driver.findElement(By.xpath("//*[@id=\"result\"]"));
        String msgText=msg.getText();
        Assert.assertEquals(msgText, "You just accepted a simple alert!");
        Reporter.log("You just accepted a simple alert!", true);


      ;

        

   }
   @Test
   public void confirmAlertCase()
   {
        WebElement confirmbtn=driver.findElement(By.id("confirmation"));
        confirmbtn.click();
        Alert alert=driver.switchTo().alert();
           System.out.println(alert.getText());
        alert.accept();
           WebElement msg=driver.findElement(By.xpath("//*[@id=\"result\"]"));
        String msgText=msg.getText();
        Assert.assertEquals(msgText, "You just accepted a confirmation alert!");
        Reporter.log("You just accepted a confirmatiom alert!", true);
         confirmbtn.click();
        driver.switchTo().alert();
        alert.dismiss();
         WebElement msg2=driver.findElement(By.xpath("//*[@id=\"result\"]"));
        String msgText2=msg2.getText();
        Assert.assertEquals(msgText2, "You just dismissed a confirmation alert!");
        Reporter.log("You just dismissed a confirmation alert!", true);

        

   }
    @Test
   public void promptAlertCase()
   {
        WebElement promptbtn=driver.findElement(By.id("prompt"));
        promptbtn.click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Hello");
        //System.out.println(alert.getText());
        alert.accept();
         WebElement msg=driver.findElement(By.xpath("//*[@id=\"result\"]"));
        String msgText=msg.getText();
        Assert.assertEquals(msgText, "You typed \"Hello\" into the prompt!");
          Reporter.log("You just typed Hello into the prompt!", true);

   }
    @AfterClass
    public void test(){
        driver.quit();
    }
}
