package L12TestNGDependencies;

import org.testng.annotations.Test;

public class SignupTest {
		

		@Test(priority=1,groups= {"regression"})
		void SignupbyEmail()
		{
			System.out.println("This is Signup by email...");
		}
		@Test(priority=2,groups= {"regression"})
		void SignupbyFacebook()
		{
			System.out.println("This is Signup by Facebook....");
		}
		@Test(priority=3,groups= {"regression"})
		void SignupbyTwitter()
		{
			System.out.println("This is Signup by twitter...");
		}

	}
