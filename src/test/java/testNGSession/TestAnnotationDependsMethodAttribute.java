package testNGSession;

import org.testng.annotations.Test;

public class TestAnnotationDependsMethodAttribute 
{
	int balance;
	@Test(dependsOnMethods = {"secondTest"})
	public void firstTest()
	{
		System.out.println("First Test");
		System.out.println("After execution of 1st Test My balance is: "+balance);
	}
	@Test
	public void secondTest()
	{
		balance = 100000;
		System.out.println("Second Test");
		System.out.println("After execution of 2nd Test My balance is: "+balance);
	}
}
