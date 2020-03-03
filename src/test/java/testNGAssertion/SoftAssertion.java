package testNGAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion 
{
	int expected = 100000;
	@Test
	public void positiveTest()
	{
		System.out.println("========== Positive Test Starts =============");
		int actual = 100000;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		System.out.println("========== Positive Test Ends =============");
		sa.assertAll();
	}
	@Test
	public void negativeTest()
	{
		System.out.println("========== Negative Test Starts =============");
		int actual = 10000;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		System.out.println("========== Negative Test Ends =============");
		sa.assertAll();
	}

}
