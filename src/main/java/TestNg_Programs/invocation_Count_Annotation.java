package TestNg_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class invocation_Count_Annotation {
	
	@Test(invocationCount = 5)
	public void method()
	{
		System.out.println("i clear the interview for sure");
	}
	@Test(invocationCount = 5)
	public void method1()
	{
		System.out.println("i clear the interview for sure");
	}
	
	//output
	/*
	 * i clear the interview for sure
       i clear the interview for sure
       i clear the interview for sure
       i clear the interview for sure
       i clear the interview for sure
	 */

}
