package testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.ISuiteListener;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterTest {
	SoftAssert softAsert = new SoftAssert();
	
	@Test(priority=1) //test case
	public void doRegisterTest(){
		String expTitle="abcd";
		String actTitle="abcdrtd";
		System.out.println("A");
		softAsert.assertEquals(actTitle, expTitle);
		softAsert.assertEquals("a", "d");
		System.out.println("B");
		
		//Assert.assertEquals(actTitle, expTitle);
		//Assert.assertTrue(3>11, "step failed");
		
		//assert.assertTrue(isElementPresent(), "element not found");
		
		//System.out.println("login");
		softAsert.assertAll();
	}
}
