package L12TestNGDependencies;

import org.testng.annotations.Test;

public class Logintest {
	

	@Test(priority=1,groups={"sanity"})
	void loginbyEmail()
	{
		System.out.println("This is login by email...");
	}
	@Test(priority=2,groups={"sanity"})
	void loginbyFacebook()
	{
		System.out.println("This is login by Facebook....");
	}
	@Test(priority=3,groups={"sanity"})
	void loginby()
	{
		System.out.println("This is login by twitter...");
	}

}
