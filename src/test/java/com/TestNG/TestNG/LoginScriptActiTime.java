package com.TestNG.TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptActiTime {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		
				FileInputStream fis=new FileInputStream ("./src/test/java/commondats.properties");
				Properties p=new Properties();
				p.load(fis);
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(p.getProperty("url"));
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong("timeouts")));
				
				
				
				
				driver.findElement(By.id("username")).sendKeys(p.getProperty("user"));
				driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
				driver.findElement(By.id("loginButton")).click();
				Thread.sleep(3000);
			if(driver.getTitle().contains("Enter"))
			System.out.println("pass");	
			else
					System.out.println("fail");
				driver.quit();
			
	

				
	}

}
