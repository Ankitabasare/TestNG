package Day_42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMTest {
	WebDriver driver;
	
  @Test(priority = -1)
	void openapp()
	 { 
	  	driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println("Open Application");
	}
	
  @Test(priority = 0)
  void testlogo()
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
	  if(logo.isDisplayed())
	  {
	  System.out.println("Logo displayed");
	  }else {
		System.out.println("Not displayed");
	}
  }
	@Test(priority = 1)
	void login()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		System.out.println("Login to Application");
	}
	@Test(priority = 2)
	void logout()
	{
		System.out.println("Logout from the application");
		//driver.close();
	}
}
