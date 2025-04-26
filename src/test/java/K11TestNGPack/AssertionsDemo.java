package K11TestNGPack;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssertionsDemo {

	
	@Test
	void testTitle()
	{
		String exp_title="Opencart";
		String act_title="Openshop";
		
		/*if(exp_title.equals(act_title))
		{
			System.out.println("test passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test failed");
			Assert.asserfalse(false);
		}*/
		Assert.assertEquals(exp_title,act_title);
	}
}
