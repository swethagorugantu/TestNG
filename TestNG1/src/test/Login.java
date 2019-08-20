package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	
	@Test(timeOut=4000)
	public void WebLogin() {
		System.out.println("Web login");
	}
	
	@Test(dependsOnMethods= {"WebLogin"})
	public void APILogin() {
		System.out.println("API login");
	}
	
	@BeforeClass
    public void MobileLogin() {
		System.out.println("Mobile Login");
	}
	
	@AfterClass
    public void MobileTest() {
		System.out.println("Mobile Test Reg");
	}
	
	
	@Test(groups={"Smoke"})
	public void LoginAPI() {
	System.out.println("Login API");
	}
	
	@BeforeSuite
	public void Order() {
	System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
	System.out.println("After Suite");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("Before Method");
	}
	
	@AfterMethod(groups={"Smoke"})
	public void afterMethod() {
	System.out.println("After Method");
	}
	
	@AfterSuite
	public void afterSuite1() {
	System.out.println("After Suite");
	}


}
