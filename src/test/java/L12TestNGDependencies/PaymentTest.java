package L12TestNGDependencies;

import org.testng.annotations.Test;

public class PaymentTest {

		@Test(priority=1,groups= {"sanity","regression","functional"})
		void PaymentinRupees()
		{
			System.out.println("Payment in Rupees...");
		}
		@Test(priority=2,groups= {"sanity","regression","functional"})
		void paymentinDallors()
		{
			System.out.println("Payment in dollars....");
		}
		

	}
