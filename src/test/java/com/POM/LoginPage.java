package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public  LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
		@FindBy(linkText ="Log in")
	private WebElement LoginLink;
	
	@FindBy(id = "Email")
	private WebElement EmailTF;

	 public WebElement getLoginLink() {
		return LoginLink;
	}


	public WebElement getEmailTF() {
		return EmailTF;
	}


	public WebElement getPasswordTF() {
		return passwordTF;
	}


	public WebElement getLoginbutton() {
		return Loginbutton;
	}
	@FindBy(id= "password")
	 private WebElement passwordTF;
	  
	 
	 @FindBy(xpath= "//input[@value='Log in']")
	 private WebElement Loginbutton;
}

