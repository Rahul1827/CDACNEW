package NGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Login {
	
	public static WebDriver wd;
	
  @Test
  public void Login() {
	  
	  wd.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
	  wd.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
	  wd.findElement(By.xpath("//button[@id='submit']")).click();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  wd= new ChromeDriver();
	  wd.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterTest
  public void afterTest() {
	  
	  wd.close();
  }

}
