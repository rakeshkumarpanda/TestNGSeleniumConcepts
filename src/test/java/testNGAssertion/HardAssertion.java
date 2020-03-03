package testNGAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion 
{
	int expected = 100000;
	@Test
	public void positiveTest()
	{
		System.out.println("========== Positive Test Starts =============");
		int actual = 100000;
		Assert.assertEquals(actual, expected);
		System.out.println("========== Positive Test Ends =============");
	}
	@Test
	public void negativeTest()
	{
		System.out.println("========== Negative Test Starts =============");
		int actual = 10000;
		Assert.assertEquals(actual, expected);
		System.out.println("========== Negative Test Ends =============");
	}

}
