package DropDrowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Down_Class {

	@Test
	public void dropdown() throws Throwable
	{
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\heman\\eclipse\\Selenium_Concepts\\Servers\\chromedriver.exe");
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.hyrtutorials.com/");
WebElement ele=	driver.findElement(By.xpath("//a[text()='Selenium Practice']"));

Actions act=new Actions(driver);

act.moveToElement(ele).perform();
Thread.sleep(3000);
WebElement ele2=driver.findElement(By.xpath("//a[text()='Dropdowns']"));
Thread.sleep(3000);
act.moveToElement(ele2).click().perform();

	driver.close();
	}
}
