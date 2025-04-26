package K11TestNGannotations;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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

 *1) Login  --@BeforeClass
 *2)Search   @test
 *3)Adv Search  @test
 *4)Logout   @AfterClass
 */
public class TestNGBC {
	WebDriver driver;
	
	@BeforeClass
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
	
	@AfterClass 
	void logout()
	{
		System.out.println("logout");
	}
	
}
