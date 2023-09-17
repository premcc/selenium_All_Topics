package TestNg_Programs;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent_Report_Class {
	
	public ExtentHtmlReporter htmlReports;
	
	public ExtentReports repor;
	public void a1()
	{
		 htmlReports=new ExtentHtmlReporter("prem.html");
		 repor=new ExtentReports();
		
		repor.attachReporter(htmlReports);
		
	}

}
