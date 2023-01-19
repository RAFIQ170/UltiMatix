package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage01 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		LoginPage login=new LoginPage(driver);
		login.getEmailTF().sendKeys("dfghjkl");
		login.getPasswordTF().sendKeys("2156321");
		login.getLoginbutton().click();
		
	
	
		

	}

}
