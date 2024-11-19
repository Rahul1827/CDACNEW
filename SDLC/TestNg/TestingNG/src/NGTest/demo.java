package NGTest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class demo {
	 public static WebDriver wd;
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(4000);
	  
	  wd.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Rahul");

	  wd.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Patil");
	  
	  wd.findElement(By.xpath("//input[@name='phone']")).sendKeys("7067332884");
      
	  wd.findElement(By.xpath("//input[@name='userName']")).sendKeys("rahul.patil.sbg@gmail.com");

	  wd.findElement(By.xpath("//input[@name='address1']")).sendKeys("21-sec B Shri Ram Nagar colony");
  
	  wd.findElement(By.xpath("//input[@name='city']")).sendKeys("Indore");
	  
	  wd.findElement(By.xpath("//input[@name='state']")).sendKeys("Madhya Pradesh");
	  
	  
	  wd.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("453441");
	  
	  
	  wd.findElement(By.xpath("//input[@name='city']")).sendKeys("Indore");
	  
	 // wd.findElement(By.xpath("//input[@name='city']")).sendKeys("Indore");
  }
  @BeforeTest
  public void beforeTest() {
	  
	   wd = new ChromeDriver();
	  wd.get("https://www.demo.guru99.com/test/newtours/register.php");
  }

}
