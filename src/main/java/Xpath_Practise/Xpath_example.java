package Xpath_Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_example {
	
	WebDriver driver;
	@Test
	public void setUp() 
	{
		driver=WebDriverManager.chromedriver().create();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/b?node=10591838031");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is found");
		}
		driver.findElement(By.id("nav-search-submit-button")).click();
	WebElement	ele=driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 (128 GB) - Blue'])[1]/ancestor::h2/../following-sibling::div[2]/descendant::span/span[2]/span[2]"));
	System.out.println(ele.getText());
		
	}

}
