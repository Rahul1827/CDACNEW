package NGTest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class PriorityTesting {
	
	public static WebDriver wd;
  @Test (priority = 1)
  public void FirstName() throws InterruptedException {
	  

Thread.sleep(4000);

wd.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Rahul");
  }
  
  @Test (priority = 2)
  public void LastName() {
	  wd.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Patil");  
  }
  
  @Test (priority = 3)
  public void phone() {
	  
	  wd.findElement(By.xpath("//input[@name='phone']")).sendKeys("7067332884");
  }
  
  @Test (priority = 4)
  public void Email() {
	  
	  wd.findElement(By.xpath("//input[@name='userName']")).sendKeys("rahul.patil.sbg@gmail.com");
  }
  
  @Test (priority = 5)
  public void Address() {
	  wd.findElement(By.xpath("//input[@name='address1']")).sendKeys("21-sec B Shri Ram Nagar colony");
  }
  
  @Test (priority = 6)
  public void city() {
	  wd.findElement(By.xpath("//input[@name='city']")).sendKeys("Indore");
  }
  
  @Test (priority = 7)
  public void state() {

wd.findElement(By.xpath("//input[@name='state']")).sendKeys("Madhya Pradesh");
  }
  
  @Test (priority = 8)
  public void postalCode() {
	  wd.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("453441");
  }
  
  @Test (priority = 9)
  public void Country() {
	  
	  Select sr= new Select(wd.findElement(By.xpath("//select[@name='country']")));
	  sr.selectByVisibleText("INDIA");
  }
  @BeforeTest
  public void beforeTest() {
	  
wd= new ChromeDriver();
wd.get("https://www.demo.guru99.com/test/newtours/register.php");
	  
  }

}


















