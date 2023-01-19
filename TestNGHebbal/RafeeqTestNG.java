package TestNGHebbal;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
Run All
public class RafeeqTestNG {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.facebook.com/login/");
	  driver.findElement(By.name("email").sendkeys("RafeeqBhai");
	  driver.findElement(By.name("pass").sendkeys("78457845");
	  driver.findElement(By.id("loginbutton").click();
  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
