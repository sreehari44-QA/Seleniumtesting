package K11TestNGPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Allannotations {
	@Test
	void xyz()
	{
	//driver=new ChromeDriver();	
	System.out.println("this is xyz from C1...");
	}
 		
	@BeforeSuite 
	void pqr()
	{
	//driver=new ChromeDriver();	
	System.out.println("this is BeforSuite...");
	}
 	@AfterSuite
	void aw()
	{
		System.out.println("This is AfterSuite");
	}
 	@BeforeTest
	void as()
	{
		System.out.println("This is BeforeTest");
	}
 	@AfterTest
	void abc()
	{
	//driver=new ChromeDriver();	
	System.out.println("this is for AfterTest");
	}
 	
	@BeforeMethod
	void aq()
	{
		System.out.println("This is Beforemethod");
	}
 	@AfterMethod
	void aws()
	{
	//driver=new ChromeDriver();	
	System.out.println("this is for Aftermethod");
	}
 	@BeforeClass
	void bt()
	{
		System.out.println("Sthis is BeforeClass");
	}
 	@AfterClass
	void at()
	{
		System.out.println("This is AfterClass");
	}
}
