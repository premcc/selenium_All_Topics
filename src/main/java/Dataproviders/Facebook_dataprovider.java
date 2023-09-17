package Dataproviders;

import java.io.FileInputStream;
import java.time.Duration;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_dataprovider {
	
	public WebDriver driver;
	
	
	@DataProvider(name = "data")
    public static Object[][] returnExcelSheetData()
        throws Throwable
        {
    
    FileInputStream fis = new FileInputStream("C:\\\\Users\\\\heman\\\\OneDrive\\\\Documents\\\\facebook\\Facebookdata.xlsx");
    XSSFWorkbook book=new XSSFWorkbook(fis);
    Sheet sheet = book.getSheet("Sheet1"); //sheet name

    int ROWS = sheet.getPhysicalNumberOfRows(); //if headers are present - use -1
    int COLS = sheet.getRow(0).getPhysicalNumberOfCells(); //read all columns
    DataFormatter df=new DataFormatter();
    Object[][] dataset = new Object[ROWS][COLS];
    for (int r = 0; r < ROWS; r++) {
        for (int j = 0; j < COLS; j++) {
          
           String cellValue=df.formatCellValue( sheet.getRow(r).getCell(j));
           
           dataset[r][j]=cellValue;
        }
    }
    book.close();
    fis.close();
    return dataset;

}
	
	@Test(dataProvider = "data")
	public void TestFb(String username,String password) throws Throwable
	{
		
		 driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.getText();
		alt.dismiss();
		driver.findElement(By.className("x3ajldb")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log out']")).click();
		
		
		
	}
	
	@AfterMethod
	public void tearDown() throws Throwable
	{
		Thread.sleep(2000);
		driver.quit();
	}
	

}





















