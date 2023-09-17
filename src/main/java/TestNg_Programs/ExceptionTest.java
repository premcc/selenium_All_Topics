package TestNg_Programs;

import org.testng.annotations.Test;

public class ExceptionTest {
	
	@Test(expectedExceptions =IllegalArgumentException.class )
	public void m1() throws InterruptedException
	{
		Thread.sleep(0);
		
	}
	

}
