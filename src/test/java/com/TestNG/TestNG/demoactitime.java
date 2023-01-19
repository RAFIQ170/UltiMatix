package com.TestNG.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoactitime {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("ABCDE");
		driver.findElement(By.name("pwd")).sendKeys("12345");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.quit();
		


	}

}
