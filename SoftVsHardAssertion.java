package Day_43_Assertion_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftVsHardAssertion

{SoftAssert sa=new SoftAssert();

	@Test
	void test_hardassertion()
	{
		System.out.println("Testing Hard........");
		System.out.println("Testing Hard........");
		
		Assert.assertEquals(1, 2);
		
		System.out.println("Testing Hard........");
		System.out.println("Testing Hard........");
	}
	
	@Test
	void test_softassertion()
	{
		System.out.println("Testing Soft........");
		System.out.println("Testing Soft........");
		
		
		sa.assertEquals(1, 1
				
				
				
				);
		
		System.out.println("Testing Soft........");
		System.out.println("Testing Soft........");
		sa.assertAll();
	}
	
	
}
