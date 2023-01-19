package com.TestNG.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledELEMENTS {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/mrafi/OneDrive/Desktop/Disabled.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement tf = driver.findElement(By.id("abc"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]" ,tf,"(");
		// TODO Auto-generated method stub

	}

}
