package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Scroll_The_Page {
	
	
	@Test
	public void findElementByTagName() throws Throwable
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\heman\\eclipse\\Selenium_Concepts\\Servers\\chromedriver.exe");
				
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Sign in securely']"));
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000);");
		
		Thread.sleep(5000);
		//ele.click();
	}

}
