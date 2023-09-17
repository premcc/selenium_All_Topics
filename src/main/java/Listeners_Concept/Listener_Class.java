package Listeners_Concept;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class Listener_Class extends Test_ScreenShot_Feature implements ITestListener {
	
	

	

	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("TestCase is started :"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("TestCase is success :"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		Date currentDate=new Date();
		String TimeStamp=currentDate.toString().replaceFirst(" ", "/").replace(":", "/");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\heman\\OneDrive\\Desktop\\Screenshot_Practise\\"+result.getName()+".png"+TimeStamp);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("Test cases is skipped:"+result.getName());
		
	}

	
	
	

}
