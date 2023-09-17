package Parameterization_In_TestNG;

import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {
	

	public static  WebDriver driver;
	
	
	@Parameters({"bro"})
	@BeforeMethod
	public static  void setUp(String bro)
	{
		if(bro.equalsIgnoreCase("chrome"))
		{
			driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		}
		else if(bro.equalsIgnoreCase("firefox"))
		{
			driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		}
		else if(bro.equalsIgnoreCase("edgedriver"))
		{
			driver=WebDriverManager.edgedriver().avoidShutdownHook().create();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	   
		
	}
	@Parameters({"dataForSearchbox"})
	@Test
	public void test1(String data) throws Throwable
	{
		 WebElement  ele2=driver.findElement(By.id("APjFqb"));
			//driver.close();
		    
		    ele2.sendKeys(data);
		    driver.findElement(By.xpath("(//input[@name='btnK'][@value='Google Search'])[2]")).click();
		    
	}
	

}
