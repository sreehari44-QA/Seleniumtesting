package L12TestNGDependencies;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGDependencies {
	
	@Test(priority=1)
	void openapp() 
	{
		System.out.println("openapp");
		Assert.assertTrue(false);
	}
	@Test(priority=2, dependsOnMethods = {"openapp"})
	void Login() 
	{
		System.out.println("login");
		Assert.assertTrue(true);
	}
	@Test(priority=3, dependsOnMethods = {"openapp"})
	void search()
	{
		System.out.println("search");
		Assert.assertTrue(true);
	}
	@Test(priority=4, dependsOnMethods = {"openapp","login"})
	void Advsearch() 
	{
		System.out.println("open advsearch");
		Assert.assertTrue(true);
	}
	@Test(priority=5, dependsOnMethods = {"openapp"})
	void Logout() 
	{
		System.out.println("open logout");
		Assert.assertTrue(true);
	}
	
}