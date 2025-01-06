package Day_44_Grouping;

import org.testng.annotations.Test;

public class PaymentTests
{

	@Test(priority = 1,groups = {"regression","sanity","functional"})
	void paymentinRupees()
	{
		System.out.println("payment is rupees");
	}
	
	@Test(priority = 2,groups = {"regression","sanity","functional"})
	void paymentinDollars()
	{
		System.out.println("payment is Dollars");
	}
}
