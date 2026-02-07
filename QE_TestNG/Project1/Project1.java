package project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
public class Project1 {
    private WebDriver driver;
    @BeforeMethod
    public void setup()
    {
        driver=new FirefoxDriver();
    }
    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }
     @Test(priority = 1)
    public void verify_site()
    {
         System.out.println("Activity1");
        driver.get("https://alchemy.hguy.co/orangehrm/");
        String title=driver.getTitle();
        System.out.println(title);
        System.out.println("Site is verified successfully");
        Assert.assertEquals(title, "OrangeHRM");
    }
      @Test(priority = 2)
    public void get_headerImage()
    {
         System.out.println("Activity2");
        driver.get("https://alchemy.hguy.co/orangehrm/");
        WebElement imageHeader_ele=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        String imageHeaderUrl=imageHeader_ele.getAttribute("src");
        System.out.println("Image url:"+imageHeaderUrl);


    }
    public void login_site()
    {
        driver.get("https://alchemy.hguy.co/orangehrm/");
        WebElement username_ele=driver.findElement(By.id("txtUsername"));
        WebElement password_ele=driver.findElement(By.id("txtPassword"));
        WebElement login_ele=driver.findElement(By.id("btnLogin"));
        username_ele.sendKeys("orange");
        password_ele.sendKeys("orangepassword123");
        login_ele.click();
    }
      @Test(priority = 3)
    public void login()
    {
         System.out.println("Activity3");
        login_site();
        System.out.println("User logined successfully");

    }
      @Test(priority = 4)
    public void add_employee() throws InterruptedException
    {
         System.out.println("Activity4");
         WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        login_site();
         WebElement PIM_ele = wait.until(
        ExpectedConditions.elementToBeClickable(
            By.xpath("//*[@id=\"menu_pim_viewPimModule\"]"))
    );
        PIM_ele.click();
        WebElement addEmp_ele = wait.until(
        ExpectedConditions.elementToBeClickable(
            By.xpath("//*[@id=\"menu_pim_addEmployee\"]"))
    );
        addEmp_ele.click();
        //WebElement btn_add=driver.findElement(By.id("btnAdd"));
        //btn_add.click();
        WebElement firstName_ele = wait.until(
        ExpectedConditions.visibilityOfElementLocated(
            By.id("firstName"))
    );
        WebElement lastName_ele=driver.findElement(By.id("lastName"));
        WebElement employeeId_ele=driver.findElement(By.id("employeeId"));
        WebElement btn_save=driver.findElement(By.id("btnSave"));
        firstName_ele.sendKeys("Harshilika");
        lastName_ele.sendKeys("Harsh");
          employeeId_ele.clear();
        employeeId_ele.sendKeys("98877");
        btn_save.click();
        //PIM_ele.click();
         WebElement empList_ele = wait.until(
        ExpectedConditions.elementToBeClickable(
            By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]"))
    );
        empList_ele.click();
        WebElement verify_username = wait.until(
        ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[@id=\"empsearch_employee_name_empName\"]"))
    );
        WebElement verifElement_id=driver.findElement(By.xpath("//*[@id=\"empsearch_id\"]"));
        //WebElement btn_search=driver.findElement(By.xpath(""));
        verify_username.sendKeys("Harshilika Harsh");
        verifElement_id.sendKeys("98877");
        //btn_search.click();
        
WebElement button = wait.until(
        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchBtn\"]"))
);
((JavascriptExecutor) driver).executeScript(
    "arguments[0].scrollIntoView(true);", button
);
((JavascriptExecutor) driver).executeScript(
    "arguments[0].click();", button
);
System.out.println("Employee added succesfully");

Thread.sleep(5000);

    }
   
     @Test(priority = 5)
    public void qualifications() throws InterruptedException
    {
         System.out.println("Activity5");
           WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
        login_site();
         WebElement info_ele = wait.until(
        ExpectedConditions.elementToBeClickable(
            By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]"))
    );
     Thread.sleep(3000);
        info_ele.click();
       
        WebElement qualification_ele = wait.until(
        ExpectedConditions.elementToBeClickable(
            By.xpath("//*[@id=\"sidenav\"]/li[9]/a"))
    );
        qualification_ele.click();
        WebElement add_btn = wait.until(
        ExpectedConditions.elementToBeClickable(
            By.xpath("//*[@id=\"addWorkExperience\"]"))
    );
        add_btn.click();
        WebElement company_ele = wait.until(
        ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[@id=\"experience_employer\"]"))
    );
          WebElement jobTitle_ele = wait.until(
        ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[@id=\"experience_jobtitle\"]"))
    );
        company_ele.sendKeys("IBM");
        jobTitle_ele.sendKeys("Quality Engineer");
       WebElement save_btn = wait.until(
        ExpectedConditions.elementToBeClickable(
            By.xpath("//*[@id=\"btnWorkExpSave\"]"))
    );
        save_btn.click();
        System.out.println("Qualifications added successfully");
      
    }
     @Test(priority = 6)
    public void apply_leave() throws InterruptedException
    {
         System.out.println("Activity6");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
       login_site();
         WebElement leave_ele = wait.until(
        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]"))
    );
        leave_ele.click();
        WebElement apply_leave_ele = wait.until(
        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu_leave_applyLeave\"]"))
    );
        apply_leave_ele.click();
         WebElement leaveType_ele = wait.until(
        ExpectedConditions.visibilityOfElementLocated(By.tagName("select"))
    );
          WebElement fromDate_ele = wait.until(
        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"applyleave_txtFromDate\"]"))
    );
       WebElement toDate_ele = wait.until(
        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"applyleave_txtToDate\"]"))
    );
        WebElement applybtn_ele = wait.until(
        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"applyBtn\"]"))
    );
        Select select=new Select(leaveType_ele);
        select.selectByVisibleText("DayOff");
        fromDate_ele.clear();
        fromDate_ele.sendKeys("2026-03-01");
        toDate_ele.clear();
        toDate_ele.sendKeys("2026-03-02");
         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", applybtn_ele);
         Thread.sleep(3000);
        applybtn_ele.click();
         WebElement myLeave_btn = wait.until(
        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu_leave_viewMyLeaveList\"]"))
    );
        myLeave_btn.click();
      Thread.sleep(3000);
      System.out.println("Leave applied");
        
    }
     @Test(priority = 7)
    public void retrieve_contacts() throws InterruptedException
    {
         System.out.println("Activity7");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
        login_site();
         WebElement info_ele = wait.until(
        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]"))
    );
    Thread.sleep(2000);
        info_ele.click();
        //Thread.sleep(2000);
         WebElement contacts_ele = wait.until(
        ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[3]/a"))
    );
     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", contacts_ele);

        contacts_ele.click();
        /*List<WebElement> tableRow_ele=driver.findElements(By.xpath("//table/tbody/tr"));
        int rowsSize=tableRow_ele.size();
        for(int i=0;i<rowsSize;i++)
        {
             List<WebElement> tableCol_ele=driver.findElements(By.xpath("//table/tbody/tr[i]/td"));
            for(WebElement data:tableCol_ele)
            {
                System.out.print(data);
            }
            System.out.println();
        }*/
         List<WebElement> rows = wait.until(
        ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//table/tbody/tr"))
    );
int rowCount = rows.size();
System.out.println("Emergency contact details");
for (int i = 0; i < rowCount; i++) {
    WebElement row = rows.get(i);
    // Find the cells within THIS row (relative search)
    List<WebElement> cells = row.findElements(By.xpath("./td"));

    for (WebElement cell : cells) {
        System.out.print(cell.getText().trim() + "  ");
    }
    System.out.println();
}

    }
      @Test(priority = 8)
    public void edit_user() throws InterruptedException
        {
            System.out.println("Activity8");
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
            login_site();
             WebElement info_ele = wait.until(
        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]"))
    );
    Thread.sleep(2000);
        info_ele.click();
WebElement edit_ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnSave\"]")));
edit_ele.click();
WebElement firstname_ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]")));
WebElement lastname_ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"personal_txtEmpLastName\"]")));
WebElement nationality_ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"personal_cmbNation\"]")));
WebElement gender_ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"personal_optGender_2\"]")));
WebElement dob_ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"personal_DOB\"]")));
firstname_ele.clear();
firstname_ele.sendKeys("Harshilika");
lastname_ele.clear();
lastname_ele.sendKeys("burra");
Select select=new Select(nationality_ele);
select.selectByVisibleText("Indian");

//gender_ele.clear();
gender_ele.click();
dob_ele.clear();
dob_ele.sendKeys("2003-09-21");
WebElement saveBtn_ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnSave\"]")));
saveBtn_ele.click();
 Thread.sleep(3000);
 System.out.println("Employee Information edited successfully");
        }
       
     @Test(priority = 9)
    public void verify_directory() throws InterruptedException
    {
         System.out.println("Activity9");
      
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
         login_site();
WebElement dir_ele = wait.until(
    ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"menu_directory_viewDirectory\"]"))
);
    Thread.sleep(5000);
   
dir_ele.click();

       
       WebElement search_dir = wait.until(
        ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[@id=\"content\"]/div[1]/div[1]/h1"))
    );
    
        String text=search_dir.getText();
        System.out.println("Directory verification:"+text);
        Assert.assertEquals(text,"Search Directory");
      
        
    }
}
