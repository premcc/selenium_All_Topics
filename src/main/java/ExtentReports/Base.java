package ExtentReports;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base {
public ExtentHtmlReporter htmlReports;
	
	public ExtentReports repor;
	
	public ExtentTest test;
	
	
	@BeforeClass
	public void setup()
	{
		 htmlReports=new ExtentHtmlReporter("prem123.html");
		 repor=new ExtentReports();
		test=repor.createTest("BasicExtent_Reports");
		repor.attachReporter(htmlReports);
		
		htmlReports.config().setDocumentTitle("TestNgPractise_Classes");
		htmlReports.config().setReportName("annoation Practise");
		
		
		
		
	}
	
	@Test
	public void method()
	{
		repor.createTest("method");
		test.log(Status.INFO, "testcase for invocation count started");
		System.out.println("i clear the interview for sure");
		test.pass("test case pass");
	}
	@Test
	public void setA()
	{
		repor.createTest("setA");
		test.log(Status.INFO, "testcase for enabled annotation started");
		System.out.println("setA executed");
		test.pass("test case pass");
	}
	
	
	@AfterClass
	public void closeAPP()
	{
		repor.flush();
		
		
	}

}
