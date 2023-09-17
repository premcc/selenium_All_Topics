package Extent_Reports;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Using_TestNg_Framework {
	
	public static  ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		htmlReporter=new ExtentHtmlReporter("C:\\Users\\heman\\eclipse\\Selenium_Concepts\\test-output\\OrangeHRm2.html");
		htmlReporter.config().setDocumentTitle("Verify_OrangeHRM_Login_Page");
		htmlReporter.config().setReportName("Orange_HRM_Login page_Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent =new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("HostName", "premchand kotha");
		extent.setSystemInfo("ProjectName", "Orange_HRM");
		extent.setSystemInfo("Feature", "Orange_HRM login page");
		extent.setSystemInfo("Operating system", "windows");
		extent.setSystemInfo("browser", "chrome");
		
		
	}
	
	@BeforeMethod
	public void Open()
	{
		test=extent.createTest("OrangeHRM_Login page");
		driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		
		test.info("Webdriver launched successfully");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
	}

	
	@AfterMethod
	public void tearUp(ITestResult result) 
	{
	
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "TestCase is pass: "+result.getName());
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "TestCase is fail "+result.getName());
			
		}
		
			
		driver.quit();
		
		
	}
	@AfterClass
	public void End()
	{
		
		//test.pass("Testcase is pass");
		extent.flush();
	}

}
