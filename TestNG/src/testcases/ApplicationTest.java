package testcases;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ApplicationTest {
	SoftAssert softAssert;
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite");
		//open browser
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite");
		//open browser
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test");
		//open browser
	}
	
	@AfterTest 
	public void afterTest(){
		System.out.println("After Test");
		//close browser
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("----before method--");
		//close browser
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("----after method--");
		//close browser
	}
	@Test(priority=1) //test case
	public void doLogin(){
		softAssert = new SoftAssert();
		softAssert.assertEquals("A", "A");
		System.out.println("login");
		softAssert.assertAll();
	}
	@Test(priority=2) //test case
	public void doChangePwd(){
		//throw new SkipException("Reason for skipping");
		softAssert = new SoftAssert();
		softAssert.assertEquals("A", "A");
		System.out.println("login");
		System.out.println("change password");
		softAssert.assertAll();
		
	}
	@Test(priority=3,  dependsOnMethods={"doChangePwd"}) //test case
	public void doLogout(){
		System.out.println("logout");
	}
}
