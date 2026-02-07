package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;                 // <-- TestNG Assert
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity2 {
    private WebDriver driver;
    @BeforeClass
    public void setup()
    {
        driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
    }
    @Test
    public void Test1(){
        String title=driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Selenium: Target Practice");
    }
    @Test
    public void Test2()
    {
         //Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Black']").isDisplayed()));
         Assert.assertTrue(
    driver.findElement(By.xpath("//button[text()='Black']")).isDisplayed()
);

        
    }
    @Test(enabled =false)
    public void Test3()
    {
        String title=driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Training Support");   
    }
    @Test
    public void Test4() throws SkipException
    {
        
         String title=driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Training Support");  
    }
    @AfterClass
    public void test(){
        driver.quit();
    }
}





