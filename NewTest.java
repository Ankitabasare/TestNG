package Day_43_AllAnnotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class NewTest {
  
	@Test(priority = 1)
	void t1()
	{
		System.out.println("this is t1");
	}
	@Test(priority = 2)
	void t2()
	{
		System.out.println("this is t2");
	}
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("this is before method");
  }
  

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("this is after method");
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("this is before class");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("this is after class");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("this is before test");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("this is after Test");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("this is after suite");
  }
  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("this is before suite");
  }

}
