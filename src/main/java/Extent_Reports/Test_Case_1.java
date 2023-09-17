package Extent_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Case_1 extends Using_TestNg_Framework{
	
	
	@Test(enabled = false)
	public void verifyTitleOfPage()
	{
		
		String expectedresult="OrangeHRM";
		String actualResult=driver.getTitle();
		
		SoftAssert sf=new SoftAssert();
		
		sf.assertEquals(actualResult, expectedresult);
		
		
		sf.assertAll();
		
	}
	
	@Test
	public void checkLogin() throws Throwable
	{
		WebElement ele1=driver.findElement(By.name("username"));
		ele1.clear();
		ele1.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.name("password"));
		ele.clear();
		ele.sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);
	}

}
