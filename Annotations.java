import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	@Test
	void login()
	{
		System.out.println("Login");
	}
	@BeforeSuite
	void a()
	{
		System.out.println("Before Suite");
	}
	@Test
	void xyz()
	{
		System.out.println("Suite");
	}
	@AfterSuite
	void a1()
	{
		System.out.println("After Suite");
	}
	@Test
	void class1()
	{
		System.out.println("This is a class1");
	}
	@BeforeClass 
	void b()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	void b1()
	{
		System.out.println("After Class");
	}
	
	@BeforeMethod
	void c()
	{
		System.out.println("Before Method");
	}
	
	@Test
	void test()
	{
		System.out.println("Data");
	}
	@AfterMethod
	void c1()
	{
		System.out.println("After Method");
	}
	
	
	
	@BeforeTest
	void d()
	{
		System.out.println("Before Test");
	}
	
	@Test
	void test2()
	{
		System.out.println("test2");
	}
	@AfterTest
	void d1()
	{
		System.out.println("After Test");
	}
}
