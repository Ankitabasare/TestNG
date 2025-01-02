package Day_43_Method_Class_Annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod 
{
	@BeforeMethod
	
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
	void advance_search()
	{
		System.out.println("Advance search");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("Logout");
	}
}
