package K11TestNGPack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
	@Test
	void xyz()
	{
	//driver=new ChromeDriver();	
	System.out.println("this is xyz from C2...");
	}
 	@AfterTest
	void at()
	{
		System.out.println("This is after test");
	}
}
