package testNGAssertion;

import org.testng.annotations.Test;

public class NormalValidation 
{
	int expected = 100000;
	@Test
	public void positiveTest()
	{
		System.out.println("========== Positive Test Starts =============");
		int actual = 100000;
		if(expected==actual)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		System.out.println("========== Positive Test Ends =============");
	}
	@Test
	public void negativeTest()
	{
		System.out.println("========== Negative Test Starts =============");
		int actual = 10000;
		if(expected==actual)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		System.out.println("========== Negative Test Ends =============");
	}

}
