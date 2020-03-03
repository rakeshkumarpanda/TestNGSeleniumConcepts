package testNGSession;

import org.testng.annotations.Test;

public class TestAnnotationPriorityAttribute 
{
	@Test(priority = 1)
	public void firstTest()
	{
		System.out.println("First Test");
	}
	@Test(priority = 2)
	public void secondTest()
	{
		System.out.println("Second Test");
	}
	@Test(priority = 3)
	public void thirdTest()
	{
		System.out.println("Third Test");
	}
	@Test(priority = 4)
	public void fourthTest()
	{
		System.out.println("Fourth Test");
	}
	@Test(priority = 5)
	public void fifthTest()
	{
		System.out.println("Fifth Test");
	}
	@Test(priority = 6)
	public void sixthTest()
	{
		System.out.println("Sixth Test");
	}
	

}
