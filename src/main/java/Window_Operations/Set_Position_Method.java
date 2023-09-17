package Window_Operations;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Set_Position_Method {
	@Test
	public void setWindow()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\heman\\\\eclipse\\\\Selenium_Concepts\\\\Servers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.hyrtutorials.com/");
		Point p=new Point(400, 400);
		driver.manage().window().setPosition(p);
		
		
	}

}
