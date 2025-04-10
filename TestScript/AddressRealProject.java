package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Basepackage.BaseClassRealProject;
import Basepackage.ClassRealProperty;

public class AddressRealProject extends ClassRealProperty
{
	@Test
	public void addaddress() {
		driver.findElement(By.xpath("//a[@class='account']")).click();
		driver.findElement(By.xpath("//a[@class='inactive']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 add-address-button']")).click();
		driver.findElement(By.xpath("//input[@name='Address.FirstName']")).sendKeys("shilpa");
		driver.findElement(By.xpath("//input[@name='Address.LastName']")).sendKeys("shilpa");
		driver.findElement(By.xpath("(//input[@class='text-box single-line'])[3]")).sendKeys("npshilpa2011@gmail.com");
		WebElement db=driver.findElement(By.xpath("//select[@data-val='true']"));
		Select sel=new Select(db);
		sel.selectByVisibleText("India");
		driver.findElement(By.xpath("(//input[@class='text-box single-line'])[5]")).sendKeys("chennai",Keys.TAB,"madipakam",Keys.TAB,"madipakam",Keys.TAB,"600091",Keys.TAB,"9962749211",Keys.TAB,Keys.TAB,Keys.ENTER);
		
		
		Reporter.log("addaddress", true);
	}
	

}
