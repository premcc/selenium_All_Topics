package DropDrowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropD_With_Select_Class {
	
	@Test
	public void dropdown() throws Throwable
	{
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\heman\\eclipse\\Selenium_Concepts\\Servers\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.hyrtutorials.com/");
WebElement ele=	driver.findElement(By.tagName("a").xpath("//a[text()='Selenium Practice']"));
ele.click();
Thread.sleep(3000);
	driver.close();
	}
}



