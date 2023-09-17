package Real_Time_Situvations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_The_WorldPopulation {
	
	
	public static String ThisYearPoup="//div[text()='This year']/parent::div/child::div";
	
	public static String TodayPopo="//div[text()='Today']/parent::div/parent::div/div/div";

	@Test
	public void m1()
	{
        WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.worldometers.info/world-population/");
		
		while(true)
		{
			List<WebElement> ele = driver.findElements(By.xpath(TodayPopo));
			for(WebElement el :ele )
			{
				System.out.println(el.getText());
			}
			
		}
		
		
		
		
	}
}
