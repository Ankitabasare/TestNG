package Day_43_Assertion_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 
{
	@Test
	void testTitle()
	{
		String exp_titleString="Ankita";
		
		String act_titleString="ankita";
		
		if(exp_titleString.equals(act_titleString))
		{
			System.out.println("test passed");
			//Assert.assertTrue(true);;
			Assert.assertEquals(exp_titleString, act_titleString);
		}
		else
		{
			Assert.assertEquals(exp_titleString, act_titleString);
			System.out.println("Test failed");
		}
	} 
}
