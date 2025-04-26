 package J10TestNG;

import org.testng.annotations.Test;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

//import org.testng.annotations.Test;

/*
  1)open application
  2)login
  3)logout
  @ test annotation
  1) TestNg execution test methods based on alphabetical order.
  2) @Test(priority=num) controls the order of execution
  3) once you provide to the test methods, then order of method is not considered
  4) priorities can be random numbers(no need to have consecutive numbers)
  5) If you don't provide priority then default value is zero(0)
  6) Negative numbers are priority(-4 -3 -2 -1 0 1 2 3 4)
  7) TestNG execute test method only if they are having @Test annotation
  */
 
public class Testng {
	@Test(priority=1)
	void openapp()
	{
		System.out.println("open application");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("login");
	}
	@Test(priority=3)
	void logout()
	{
		  System.out.println("logout");
	}
	
}
