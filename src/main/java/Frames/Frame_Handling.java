package Frames;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Handling {
	
	
	public void verifyFrame()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\heman\\\\eclipse\\\\Selenium_Concepts\\\\Servers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/");
		
		
	}

}
