import java.net.MulticastSocket;

import org.testng.annotations.Test;

public class Priority {

	@Test
	void openapp()
	{
		System.out.println("Testing");
	}
	@Test(priority = 1)
	void login()
	{
		System.out.println("Login");
	}
	@ Test(priority = 1)
	void app_login()
	{
		System.out.println("App- Login");
	}
	@Test(priority = 2)
	void Logout()
	{
		System.out.println("Logout");
	}
}
