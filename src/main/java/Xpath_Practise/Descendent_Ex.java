package Xpath_Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Descendent_Ex {
	
	/*
	 * descendant basically identifies the grand childs of a parent
	 */
	
	@Test
	public void Va()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		//(//span[text()='Apple iPhone 14 (128 GB) - Blue']/ancestor::h2/../following-sibling::div/descendant::span[@class='a-offscreen'])[1]
		WebElement ele=driver.findElement(By.xpath("(//span[text()='58,999']/ancestor::a/../../../../../preceding-sibling::div/descendant::a)[3]"));
		System.out.println(ele.getText());
	
		//
		
	}

}
