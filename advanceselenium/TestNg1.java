package advanceselenium;

import org.testng.annotations.Test;

public class TestNg1 
{
	@Test(priority = 3)
	public void login()
	{
		System.out.println("Login");
	}
	@Test(priority = 1)
	public void openBrowser()
	{
		System.out.println("Browsero Opening");
	}
	@Test(priority = 2)
	public void Register() {
		System.out.println("Register");
	}

}
