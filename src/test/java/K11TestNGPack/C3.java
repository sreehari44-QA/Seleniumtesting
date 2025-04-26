package K11TestNGPack;

import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@Test 
	void pqr()
	{
	//driver=new ChromeDriver();	
	System.out.println("this is pqr from C3...");
	}
 	@BeforeSuite
	void at()
	{
		System.out.println("This is before suite");
	}
 	@AfterSuite
	void as()
	{
		System.out.println("This is after suite");
	}
}
