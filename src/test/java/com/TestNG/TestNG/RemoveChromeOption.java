package com.TestNG.TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemoveChromeOption {

	public static void main(String[] args) {
		
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications","start-maximized");
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

	}

}
