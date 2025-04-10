package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Basepackage.ClassRealProperty;

public class AddProduct1 extends ClassRealProperty
{
	@Test(groups = "smoke")
	public void addproduct1() throws Throwable {
		driver.findElement(By.xpath("//a[@class='account']")).click();
		driver.findElement(By.xpath("//a[@href='/apparel-shoes']")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		//WebElement dropdown = driver.findElement(By.xpath("//select[@class='valid']"));
		//Select sel=new Select(dropdown);
		driver.findElement(By.xpath("//img[@src='https://demowebshop.tricentis.com/content/images/thumbs/0000018_50s-rockabilly-polka-dot-top-jr-plus-size_125.jpg']")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		Thread.sleep(6000);
		
		
	}

}
