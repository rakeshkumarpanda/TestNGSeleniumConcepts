package testNGSession;

import org.testng.annotations.Test;

public class TestAnnotationInvocationCountAttribute 
{
	@Test(invocationCount = 3)
	public void firstTest()
	{
		System.out.println("First Test");
	}	

}
