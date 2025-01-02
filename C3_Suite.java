package Day_43_TestAnnotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3_Suite
{

	@Test
	void pqr()
	{
		System.out.println("This is class  from c3");
	}
	
	@BeforeSuite
	void abce()
	{
		System.out.println("Before suite");
	}
	
	@AfterSuite
	void xt()
	{
		System.out.println("After suite");
	}
}
