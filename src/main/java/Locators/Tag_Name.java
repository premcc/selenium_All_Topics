package Locators;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tag_Name {
	
	@Test
	public void findElementByTagName() throws Throwable
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\heman\\eclipse\\Selenium_Concepts\\Servers\\chromedriver.exe");
				
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		List<WebElement> elements = driver.findElements(By.tagName("span"));
		
		System.out.println(elements.size());
		
		for (WebElement webElement : elements) {
			
			System.out.println(elements.get(1).getText());
		}

}
}

