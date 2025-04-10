package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Basepackage.Baseclass;

public class Address extends AddressRealProject
{
	@Test
	public void addaddress() {
		Reporter.log("addaddress", true);
	}
	@Test
	public void deleteaddress() {
		Reporter.log("deleteaddress", true);
	}
	

}
