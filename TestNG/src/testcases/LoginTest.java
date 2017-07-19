package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
	
	SoftAssert softAssert;
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("after method");
	}
	
	@Test(priority=1, dataProvider="getData") //test case
	public void doLoginTest(String UserName, String Pwd, String Browser, int  Phone){
		softAssert = new SoftAssert();
		
		System.out.println(UserName +"-----"+Pwd);
		softAssert.assertEquals("A", "A");
		System.out.println("login");
		softAssert.assertAll();
	}
	
	@DataProvider(parallel=true)
	public Object[][] getData (){
		Object[][] data = new Object[3][4];
		data[0][0]="Uname";
		data[0][1]="Pwd";
		data[0][2]="IE";
		data[0][3]=151;
		
		data[1][0]="Uname3";
		data[1][1]="Pwd3";
		data[1][2]="Chrome";
		data[1][3]=415;
		
		data[2][0]="Uname3";
		data[2][1]="Pwd3";
		data[2][2]="Chrome";
		data[2][3]=415;
		return data;
	}
	
	

}
