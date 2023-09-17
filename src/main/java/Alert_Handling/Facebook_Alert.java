package Alert_Handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Alert {
	
	public WebDriver driver;
	@Test
	public void TestFb() throws Throwable
	{
		
		 driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("6301315984");
		driver.findElement(By.id("pass")).sendKeys("premchand");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.getText();
		alt.accept();
		driver.findElement(By.className("x3ajldb")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log out']")).click();
		
		driver.quit();
		
		
		
	}
	

}
