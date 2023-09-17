package TestNg_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class priority_Class {
	
	@Test(priority = 1)
	public void AAA()
	{
		System.out.println("AAA executed");
	}
	@Test(priority = 3)
	public void BBB()
	{
		System.out.println("BBB executed");
	}
	@Test(priority = 2)
	public void CCC()
	{
		System.out.println("CCC executed");
	}
	@Test
	public void bDD()
	{
		System.out.println("bDD executed");
	}

}

/*
 * 1. concept: the priority flag take the execution from zero
 * 
 * 2. if we make same priority of two testcases then execution based on the alphabetical order
 * 
 */
