package com.TestNG.TestNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToApllication {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.com/");
		
		
		

		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.location=arguments[0]","https://www.amazon.com/");
		 Thread.sleep(2000);
		 System.out.println(js.executeScript("return document.title"));
		 System.out.println(js.executeScript("return document.URL"));
		 Thread.sleep(2000);
		 js.executeScript("history.go(0)");
		
		
	//	System.out.println(titleOfThePage);// TODO Auto-generated method stub;
driver.quit();
	}

}
