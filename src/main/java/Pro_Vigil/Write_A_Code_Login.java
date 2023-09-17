package Pro_Vigil;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Write_A_Code_Login {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\heman\\eclipse\\Selenium_Concepts\\Servers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("URL");
		driver.findElement(By.id("username")).sendKeys("Username");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("login")).click();
	   
		
		
	}

}
