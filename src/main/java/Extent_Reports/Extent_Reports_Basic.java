package Extent_Reports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_Reports_Basic {
	
	public static void main(String[] args) throws Throwable {
		
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extent_reports.html");
		
		htmlReporter.config().setDocumentTitle("Verify google search scenario");
		htmlReporter.config().setReportName("google search");
		htmlReporter.config().setTheme(Theme.DARK);
	   ExtentReports extent=new ExtentReports();
	   extent.attachReporter(htmlReporter);
	   extent.setSystemInfo("HostName", "Prem chand");
	   extent.setSystemInfo("ProjectName", "Google application");
	   extent.setSystemInfo("feature", "google login page");
	   
	   ExtentTest test=extent.createTest("googleSerach");
	   
	   
	   WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
	   test.info("driver is initialised");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.google.com/");
	   test.pass("driver is navigated to google page");
	   driver.findElement(By.name("q")).sendKeys("OG");
	   test.pass("data is entered into searchbox ");
       driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
       test.pass("click the searchButton");
       
       Thread.sleep(5000);
	   driver.close();
	   test.pass("driver is close the browser");
	   
	   test.pass("test is completed");
	   
	   extent.flush();
	   
	}

}
