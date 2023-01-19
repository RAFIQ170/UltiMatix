package com.TestNG.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Vtiger01
{
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Organizations')]/parent::td[@class='tabUnSelected']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Organization')]/ancestor::td[@class='small']/child::b[1]")).click();
       driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Hp World");
       driver.findElement(By.xpath("//input[@name='website']")).sendKeys("hp world.com");
       driver.findElement(By.xpath("//input[@name='employees']")).sendKeys("100");
       driver.findElement(By.xpath("//input[@name='email2']")).sendKeys("rafiqm170@gmail.com");
       WebElement dd = driver.findElement(By.name("industry"));
	  Select select=new Select(dd);
	  select.selectByValue("Education");
	WebElement dt = driver.findElement(By.name("accounttype"));
	 Select select1=new Select(dt);
	 select1.selectByValue("Investor");
	 driver.findElement(By.xpath("//input[@value='U']")).click();
	 WebElement da = driver.findElement(By.name("assigned_user_id"));
	 Select select2=new Select(da);
	 select2.selectByValue("1");
	 driver.findElement(By.name("bill_street")).sendKeys("at post nagwara near JMJ Hospital 560045");
	 driver.findElement(By.name("bill_pobox")).sendKeys("Nagwara");
	 driver.findElement(By.name("bill_city")).sendKeys("Banglore");
	 driver.findElement(By.name("bill_state")).sendKeys("Karnataka");
	 driver.findElement(By.name("bill_code")).sendKeys("560045");
	 driver.findElement(By.name("bill_country")).sendKeys("India");
	 driver.findElement(By.id("phone")).sendKeys("8123266277");
	 driver.findElement(By.id("fax")).sendKeys("fax12345");
	 driver.findElement(By.id("email1")).sendKeys("rafiqm170@gmail.com");
	 driver.findElement(By.id("ownership")).sendKeys("Rafiq");
	 WebElement dr = driver.findElement(By.name("rating"));
	 Select select3=new Select(dr);
	 select3.selectByValue("Active");
	 driver.findElement(By.id("siccode")).sendKeys("012345");
	 driver.findElement(By.name("annual_revenue")).sendKeys("2500000");
	 driver.findElement(By.name("notify_owner")).click();
	 driver.findElement(By.xpath("//input[@onclick='return copyAddressRight(EditView)']")).click();
	 driver.findElement(By.name("description")).sendKeys("we are added all mandatory details requred for creating new orgnix=zation");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	 Thread.sleep(2000);
	// driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]]")).click();
	 driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG/']")).click();
	 driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]]")).click();

	}

}
