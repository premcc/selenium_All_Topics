package Listeners_Concept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Listener_Class.class)
public class Test_ScreenShot_Feature {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void setup()
	{
		driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
	}
	@Test(priority = 1)
	public void verifyTitleOfPage()
	{
		
		String expectedresult="OrangeHR";
		String actualResult=driver.getTitle();
		
		SoftAssert sf=new SoftAssert();
		
		sf.assertEquals(actualResult, expectedresult);
		
		
		sf.assertAll();
		
	}
	
	@Test(priority = 2)
	public void checkLogin() throws Throwable
	{
		WebElement ele1=driver.findElement(By.name("username"));
		ele1.clear();
		ele1.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.name("password"));
		ele.clear();
		ele.sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown() throws Throwable
	{
		Thread.sleep(4000);
		driver.quit();
		
	}


}
