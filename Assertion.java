package Day_43_Assertion_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion
{
	@Test
	void testTitle()
	{
		String exp_titleString="Ankita";
		
		String act_titleString="Ankita";
		
	/*	if(exp_titleString.equals(act_titleString))
		{
			System.out.println("test passed");
		}
		else {
			System.out.println("Test failed");
		}*/
		
		Assert.assertEquals(exp_titleString, act_titleString);
		System.out.println("Passed");
	} 
	
}
