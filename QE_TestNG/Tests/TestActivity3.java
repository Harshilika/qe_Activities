package demos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;                 // <-- TestNG Assert
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestActivity3
 {
    private WebDriver driver;
    @BeforeClass
    public void setup()
    {
        driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form");
    }
    @Test
    public void Test1(){
        WebElement username=driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement submit=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/form/button"));
        username.sendKeys("admin");
        password.sendKeys("password");
        submit.click();
        WebElement message=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div/h2"));
        String text=message.getText();
        Assert.assertEquals(text, "Welcome Back, Admin!");
    }
    @AfterClass
    public void test(){
        driver.quit();
    }
}
