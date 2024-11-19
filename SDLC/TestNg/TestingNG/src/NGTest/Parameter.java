package NGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Parameter {
	
	public static WebDriver wd;
	
  @Test
  @Parameters({"un","pw"})
  public void Login(String un , String pw) throws InterruptedException {
	  
	  wd.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
	  wd.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//button[@id='submit']")).click();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  wd= new ChromeDriver();
	  wd.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(2000);
	  wd.close();
  }

}
