package JavaScriptExecutor;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import JavaScript_Executor.Send_Keys;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Send_Data_Usi_JSE {

	public static void SendKeys(WebDriver driver,WebElement ele)
	
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='prem' ",ele);
		
	}
	
	
	
	@Test
	public void setup() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.id("email"));
		System.out.println(driver.getTitle());
		SendKeys(driver,ele);
		
	}
}
