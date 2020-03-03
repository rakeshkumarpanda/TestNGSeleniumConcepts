package testNGSession;

import org.testng.annotations.Test;

public class TestAnnotationEnableAttribute 
{
	@Test
	public void firstTest()
	{
		System.out.println("First Test");
	}
	@Test
	public void secondTest()
	{
		System.out.println("Second Test");
	}
	@Test(enabled = false)
	public void thirdTest()
	{
		System.out.println("Third Test");
	}
	@Test
	public void fourthTest()
	{
		System.out.println("Fourth Test");
	}
	@Test(enabled = false)
	public void fifthTest()
	{
		System.out.println("Fifth Test");
	}
	@Test
	public void sixthTest()
	{
		System.out.println("Sixth Test");
	}
	

}
