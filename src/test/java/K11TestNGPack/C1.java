package K11TestNGPack;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	@Test
	void abc()
	{
	//driver=new ChromeDriver();	
	System.out.println("this is for abc from C1");
	}
 	@BeforeTest
	void bt()
	{
		System.out.println("Sthis is befortest");
	}
}
