package com.TestNG.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime02 {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Return')]")).click();
		// TODO Auto-generated method stub
driver.findElement(By.xpath("(//a[contains(text(),' Take product tour')])[1]"));
driver.findElement(By.xpath("(//a[contains(text(),' Products')])"));
driver.findElement(By.xpath("(//a[contains(text(),' Features')])[1]"));
driver.findElement(By.xpath("(//a[contains(text(),' Solutions')])"));
driver.findElement(By.xpath("(//a[contains(text(),' Resources')])"));
	}

}
