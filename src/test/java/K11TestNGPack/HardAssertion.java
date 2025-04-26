package K11TestNGPack;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class HardAssertion {
	@Test
	void test() {
		Assert.assertEquals("xyz", "xyz");
	}
	

}
