package Day_43_TestAnnotation;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 
{
	
	@Test
	void abc()
	{
		System.out.println("this is a normal method from c1");
	}
	
	@BeforeTest
	
	void bt()
	{
		System.out.println("this is before test");
	}
}
