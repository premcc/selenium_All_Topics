package TestNg_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ThreadPoolSize {
	
@Test(priority = 1)
public void test1()
{
	System.out.println("It is executed");
	
}
@Test(invocationCount = 5,priority = 1,enabled = false)
public void test2()
{
	System.out.println("It is not recomended");
}
}
