package Real_Time_Situvations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Element {
	
	@Test
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("samsung mobile");	
		driver.findElement(By.id("nav-search-submit-button")).click();
		//span[text()='Samsung Galaxy S23 5G (Green, 8GB, 256GB Storage)']/../../../following-sibling::div[2]/div/div/div/div/following-sibling::div/a/span
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Samsung Galaxy S23 5G (Green, 8GB, 256GB Storage)']/../../../following-sibling::div[2]/div/div/div/div/following-sibling::div/a/span"));
		ele2.click();
		
		System.out.println(ele2.getText());
		
	}

}
