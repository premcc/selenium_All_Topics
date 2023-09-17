package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flashing_element_Using_JSE {
	
	
	public static void changeColor(String color,WebElement element,WebDriver driver) throws Throwable
	{
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.backgroundColor = 'red'"+color+"'"+element);
		
		Thread.sleep(20);
		
	}

	public static void flash(WebElement element, WebDriver driver) throws Throwable {
String color=element.getCssValue("backgroundColor");
		
		for(int i=0;i<500;i++)
		{
			changeColor("#000000",element,driver);
			changeColor(color,element,driver);
		}	
		
	}

	

}
