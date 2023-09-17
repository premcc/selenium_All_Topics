package WebDriiverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Use_1 {
	
	
	public static  WebDriver driver;
	
	public static  void setUp(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=WebDriverManager.chromedriver().create();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=WebDriverManager.firefoxdriver().create();
		}
		else if(browser.equalsIgnoreCase("edgedriver"))
		{
			driver=WebDriverManager.edgedriver().create();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}
	public static void main(String[] args) {
		
		setUp("EDGEdriver");
		
	}

}
