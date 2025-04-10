package advanceselenium;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg3 
{
	@Test(dependsOnMethods="register",priority = 1)
	public void login() {
		System.out.println("Login");
		
	}
	@Test
	public void openBrowser() {
		System.out.println("Browser Opening");
	}
	@Test
	public void register() { 
		//Assert.fail();
		System.out.println("Register");
	}
	
	

}
