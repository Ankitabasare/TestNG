package Day_43_Assertion_Demo;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion
{

	@Test
	void test()
	{
		
		assertEquals(false, false);
	}
}
