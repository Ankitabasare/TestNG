package Day_42;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestCase 
{
	WebDriver driver= new ChromeDriver();
	
	@Test(priority = -1)
	void openapp()
	{
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println("Open Application");
	}
	
	@Test(priority = 0)
	void login()
	{
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		System.out.println("Login to Application");
	}
	@Test(priority = 1)
	void logout()
	{
		System.out.println("Logout from the application");
		//driver.close();
	}
}
