package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

	@BeforeTest (enabled=false)
	public void demo() {
		System.out.println("hello");
		
	}
	
	@AfterTest
	public void second() {
		System.out.println("hello");
		
	}
	  
	@Parameters({ "URL" })
	@Test
	public void WebLogin(String url) {
		System.out.println("Web login");
		System.out.println(url);
	}
	
	@Test(dataProvider="getData")
	public void dataTest(String us, String pwd) {
		System.out.println("getData");
		System.out.println(us);
		System.out.println(pwd);
		Assert.assertTrue(false);
	}
	
	
	
	@DataProvider
	public Object[][] getData() {
		//testing with different combinations
		Object[][] data=new Object[3][2];//multi-dimensional object array
		//first set
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		///second set
		data[1][0]="secondusername";
		data[1][1]="second password";
		//third set
	    data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
		
	}
	@AfterTest
	public void assertFail() {
		System.out.println("Asssert Fail");
		
	}
	
	

}
