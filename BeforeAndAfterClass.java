package Day_43_Method_Class_Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAndAfterClass 
{

	@BeforeClass
	void login()
	{
		System.out.println("Login");
	}
	
	@Test(priority = 1)
	void search()
	{
		System.out.println("Search");
	}
	
	@Test(priority = 2)
	void advance_Search()
	{
		System.out.println("Advance Search");
	}
	@AfterClass
	void logout()
	{
		System.out.println("Logout");
	}
}
