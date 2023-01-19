package com.TestNG.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autantication01 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(200);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[name()='svg'][@viewBox='0 0 17 18']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(text(),'iPhone')]/ancestor::div[@class='_1AtVbE col-12-12']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		
for(WebElement e:list) {
	System.out.println(e.getText());
	
	
	
	
	
}
driver.quit();
	}
	

}
