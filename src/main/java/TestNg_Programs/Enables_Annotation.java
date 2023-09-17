package TestNg_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Enables_Annotation {
	
	@Test(enabled = true)
	public void setA()
	{
		System.out.println("setA executed");
	}
	@Test(enabled = false)
	public void setB()
	{
		System.out.println("setB executed");
	}
	
	/*Output:
	 * 
	 * setB executed
	 * 
	 */

}
