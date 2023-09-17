package Real_Time_Situvations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Google_Search_Prefers {
	
	@Test
	public void m1()
	{
        WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		//div[role='presentation']
		driver.findElement(By.id("APjFqb")).sendKeys("Pushpa");
		List<WebElement> ele = driver.findElements(By.xpath("//div[@role='presentation']/div/div/ul/li"));
		
		for(WebElement data:ele)
		{
			System.out.println(data.getText());
			
			if(data.getText().equals("pushpa naa songs"))
			{
				
				data.click();
			}
			
			
		}
		
	}

}
