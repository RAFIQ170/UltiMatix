package com.TestNG.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggation01 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("mohammed ");
		Thread.sleep(2000);
		
		  driver.findElement(By.xpath("//span[text()='Mohammed bin Salman Al Saud']")).click();
		
		// TODO Auto-generated method stub

	
	}

}
