package K11TestNGannotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 TC1
 @Test
 @BeforeMethod
 @afterMethod
 @BeforeCLass
 @AfterClass
 @BeforeSuite
 @AfterSuite
 @BeforeTest
 @AfterTest

 * 1) Login  --@BeforeMethod
 *2)Search   @test
 *3)Logout   @AfterMethod
 *4)Login
 *5)Adv Search  @test
 *6)Logout    
 *
 *
 */

public class Testannotations {
	
	WebDriver driver;
	
	@BeforeMethod
	void login()
	{
	driver=new ChromeDriver();	
	System.out.println("before login");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("Search");
	}
	@Test(priority=2)
	void Advsearch() 
	{
		System.out.println("Adv search");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("logout");
	}
	
}
