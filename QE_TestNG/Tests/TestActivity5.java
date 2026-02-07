package demos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;                 // <-- TestNG Assert
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;


public class TestActivity5
 {
    private WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void setup()
    {
        driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
    }
    @Test
    public void Test1()
    {
        System.out.println(driver.getTitle());
    }
    @Test(groups={"Header Tests"})
    public void Test2()
    {
        WebElement h3=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h3[1]"));
        
        String text=h3.getText();
        Assert.assertEquals(text,"Heading #3");
        
    }
     @Test(groups={"Header Tests"})
    public void Test3()
    {
        WebElement h5=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h5"));
        String color=h5.getCssValue("color");
        System.out.println(color);
        Assert.assertEquals(color,"rgb(147, 51, 234)");
    }
    @Test(groups={"Button Tests"})
    public void Test4()
    {
        WebElement emerald=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/button[8]"));
        
        String text=emerald.getText();
        Assert.assertEquals(text,"Emerald");
        
       
    }
    @Test(groups={"Button Tests"})
    public void Test5()
    {
        WebElement purple=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/button[5]"));
        String color=purple.getCssValue("color");
        Assert.assertEquals(color,"rgb(88, 28, 135)");
    }
    @AfterClass
    public void test(){
        driver.quit();
    }
}
