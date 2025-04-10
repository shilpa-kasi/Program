package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Basepackage.ClassRealProperty;

public class FunctionalityTest extends ClassRealProperty
{
	@DataProvider
	public String [][] datasupplier(){
		String[][]data=new String[5][2];
		data[0][0]="shilpa";
		data[0][0]="naidu";
		data[0][0]="maansi";
		data[0][0]="naidu";
		data[0][0]="gouresh";
		data[0][0]="naidu";
		data[0][0]="kasi";
		data[0][0]="naidu";
		data[0][0]="hari";
		data[0][0]="naidu";
		return data;
		}
	@Test(dataProvider = "dataSupplier")
	public void personalDetailsTest(String fn,String ln) {
		driver.findElement(By.xpath("//a[@class='account']")).click();
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.clear();
		firstName.sendKeys(fn);
	 WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.clear();
		lastName.sendKeys(ln);
		
		
		
		
		
	}
	
	

}
