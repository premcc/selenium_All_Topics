package Cross_Browsing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_cross_Browsing {
	
	public static WebDriver driver;
	
//	ChromeOptions op1=new ChromeOptions();
//	FirefoxOptions op2=new FirefoxOptions();
//	EdgeOptions op3=new EdgeOptions();
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser )
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
			
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
			
			
		}
		else if(browser.equalsIgnoreCase("edgedriver"))
		{
			driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
			
		}
		driver.get("https://www.google.com/");
		
	}
	@Test
	public void test2()
	{
		 WebElement  ele2=driver.findElement(By.id("APjFqb"));
			//driver.close();
		    
		    ele2.sendKeys("RRR collections");
		    driver.findElement(By.xpath("(//input[@name='btnK'][@value='Google Search'])[2]")).click();
		    
	}

}
