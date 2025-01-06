package Day_44_Dependency_Methods;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Dependency_Demo 
{

	@Test(priority = 1)
	void openApp()
	{
		System.out.println("Open application");
		assertEquals(false, false);
	}
	
	@Test(priority = 2, dependsOnMethods = {"openApp"})
	void login()
	{
		System.out.println("Login into Application");
		assertEquals("123", 123);
	}
	@Test(priority = 3,dependsOnMethods = {"login"})
	void search()
	{
		System.out.println("Search in Application");
	}
	@Test(priority = 4,dependsOnMethods = {"login","search"})
	
	void advance_search()
	{
		System.out.println("Advance Search");
	}
	
	@Test(priority = 5,dependsOnMethods = {"openApp"})
	void logout()
	{
		System.out.println("Logout from Applicayion");
	}
}
