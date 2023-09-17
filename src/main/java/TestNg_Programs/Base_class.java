package TestNg_Programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base_class {
	
	
public ExtentHtmlReporter htmlReports;
	
	public ExtentReports repor;
	
	public ExtentTest test;
	
	
	@BeforeClass
	public void setup()
	{
		 htmlReports=new ExtentHtmlReporter("prem123.html");
		 repor=new ExtentReports();
		
		repor.attachReporter(htmlReports);
		
		
	}
	
	@AfterClass
	public void closeAPP()
	{
		repor.flush();
		
		
	}

}
