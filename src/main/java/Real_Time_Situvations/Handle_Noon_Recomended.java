package Real_Time_Situvations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Noon_Recomended {
	
	@Test
	public void m1() throws Throwable
	{
        WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.noon.com/uae-en/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(1000,1000);");
		WebElement swipe=driver.findElement(By.xpath("//div[@class='swiper-button-prev custom-navigation swiper-nav-home-productCarousel-componentArea-17-componentRow-productCarousel-0-1693374647533 swiper-button-disabled']"));
		List<WebElement> ele=driver.findElements(By.xpath("//h2[text()='Recommended for you']/parent::div/../following-sibling::div/div/div/div"));
		
		for(WebElement value:ele)
		{
			System.out.println(value.getText());
			
			if(value.getText().equals(null))
			{
				Thread.sleep(2000);
				swipe.click();
			}
		}
		
		
				
			
			
		
		
	}

}
