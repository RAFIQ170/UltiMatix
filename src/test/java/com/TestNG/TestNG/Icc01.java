package com.TestNG.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Icc01 {
	
	@Test
	public void getPlayerList() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/homepage");
		driver.findElement(By.xpath("//div[@class='main-navigation__header u-hide-desktop']//following-sibling::button[contains(text(),'Rankings')]")).click();
		
		driver.findElement(By.xpath("//nav[contains(@class,'main-navigation__desktop-list js-desktop-nav')]//a[contains(@class,'linked-list__link')][normalize-space()='Players Rankings']")).click();
		driver.findElement(By.xpath("//a[@href='/rankings/mens/player-rankings/t20i/batting']")).click();
		
		List<WebElement> playerlist = driver.findElements(By.xpath("//td[@class='table-body__cell rankings-table__name name']"));
		List<WebElement> playerruns = driver.findElements(By.xpath("//td[@class='table-body__cell rankings-table__name name']//following-sibling::td[@class='table-body__cell rating']"));
		
		System.out.println("=============================================================");
		System.out.println("Player Name               Runs scored");
		System.out.println("=============================================================");
		for (int i = 0; i < playerlist.size(); i++) {
			System.out.println(playerlist.get(i).getText()+"         			"+playerruns.get(i).getText());
			
		}
		System.out.println("============================================================="); 
	}
}



