package Day_44_Grouping;

import org.testng.annotations.Test;

public class SignupTest
{
	@Test(priority = 1,groups = {"regression"})
	void signByEmail()
	{
		System.out.println("This is a signup by email");
	}
	
	@Test(priority = 2,groups = {"regression"})
	void signupByFacebook()
	{
		System.out.println("This is a signup by facebook");
	}
	
	@Test(priority = 3,groups = {"regression"})
	void loginByTwitter()
	{
		System.out.println("This is a signup by Twitter");
	}
}
