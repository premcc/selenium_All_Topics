package TestNg_Programs;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependends_On_Annotation {
	
	@Test
	public void core()
	{
		System.out.println("core method");
	}
	
	@Test(dependsOnMethods = "core",priority = 1)
	public void itsDependMethod()
	{
		System.out.println("depended method");
	}
	
	
	//Concept 2
	@Test()
	public void galaxy()
	{
		System.out.println("galaxy is rotated");
		
		String gravity="lost";
		AssertJUnit.assertEquals(gravity, "stii have");
	}
	@Test(dependsOnMethods = "galaxy",priority = 2)
	public void solarSystem()
	{
		System.out.println("solar system is existed because of galaxy");
	}

}
