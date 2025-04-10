package TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Basepackage.ClassRealProperty;

public class AddProduct extends ClassRealProperty
{
	@Test(groups = "regression")
	public void addproduct() throws Throwable
	{
		driver.findElement(By.xpath("//a[@href='/computers']")).click();
		driver.findElement(By.xpath("(//a[@href='/desktops'])[4]")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='qty-input']")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Thread.sleep(3000);
		System.out.println("addproduct");
		
	}
	

}
