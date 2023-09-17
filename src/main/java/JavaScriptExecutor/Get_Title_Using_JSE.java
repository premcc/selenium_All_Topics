package JavaScriptExecutor;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Title_Using_JSE {
	
	
	public static String title(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	String titleofPage=jse.executeScript("return document.title").toString();
	return titleofPage;
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
		System.out.println(title(driver));
		
		System.out.println(driver.getTitle());
		
	}

}
