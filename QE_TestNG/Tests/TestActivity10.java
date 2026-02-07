package demos;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.time.Duration;
public class TestActivity10 {
       private WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void setup()
    {
        driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/simple-form");
    }
     @DataProvider(name = "excelData")
    public Iterator<Object[]> getExcelData() throws IOException {
        List<Object[]> data = new ArrayList<>();
        String excelPath = "src/test/resources/activity10.xlsx";

        try (FileInputStream fis = new FileInputStream(excelPath)) {
            Workbook workbook = new XSSFWorkbook(fis);

            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter formatter = new DataFormatter();

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if(row == null) continue;
                
                String[] rowData = new String[row.getLastCellNum()];
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    rowData[j] = formatter.formatCellValue(row.getCell(j));
                }
                data.add(rowData);
            }
            workbook.close();
        }
        for (Object[] info: data) {
            for (Object val: info) {
                System.out.println(val);
            }
        }
        return data.iterator();
    }

    @Test(dataProvider = "excelData")
    public void verifyUserDetails(String fullname, String email, String date,String details) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().refresh();
        WebElement fullname_ele = driver.findElement(By.id("full-name"));
        WebElement email_ele=driver.findElement(By.id("email"));
        WebElement date_ele=driver.findElement(By.xpath("//*[@id=\"signInForm\"]/input[3]"));
        WebElement details_ele=driver.findElement(By.xpath("//*[@id=\"additional-details\"]"));
        WebElement submit_ele=driver.findElement(By.xpath("//*[@id=\"signInForm\"]/button"));
        fullname_ele.sendKeys(fullname);
        email_ele.sendKeys(email);
        date_ele.sendKeys(date.replace("/", "-"));
        details_ele.sendKeys(details);
        submit_ele.click();
        
WebElement successMsg = wait.until(
        ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"action-confirmation\"]")
        )
);
System.out.println(successMsg.getText());
    }
     @AfterClass
    public void test(){
        driver.quit();
    }


}
