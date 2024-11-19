package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver wd= new ChromeDriver();
		
//		wd.get("https://www.demoblaze.com");
//		wd.findElement(By.id("signin2")).click();
//		Thread.sleep(2000);
//		wd.findElement(By.id("sign-username")).sendKeys("Rahul");
//		wd.findElement(By.id("sign-password")).sendKeys("Rahul@123");
//		wd.findElement(By.className("btn")).click();
//		
		
		
	wd.get("https://demo.guru99.com/test/newtours/register.php");
//		wd.manage().window().maximize();
//		wd.findElement(By.name("firstName")).sendKeys("Rahul");
//		wd.findElement(By.name("lastName")).sendKeys("Patil");
//		wd.findElement(By.name("phone")).sendKeys("7067332884");
//		wd.findElement(By.name("userName")).sendKeys("rahul.patil.sbg@gmail.com");
//		wd.findElement(By.name("address1")).sendKeys("Shri ram nagar colony Gujarkheda mhow");
//		wd.findElement(By.name("city")).sendKeys("Indore");
//		wd.findElement(By.name("state")).sendKeys("Madhya Pradesh");
//		wd.findElement(By.name("postalCode")).sendKeys("453441");
//	WebElement we=null;
//		
//		Select sr = new Select(wd.findElement(By.name("country")));
//		sr.selectByVisibleText("INDIA");
//		wd.findElement(By.name("password")).sendKeys("Rahul@123");
//		wd.findElement(By.name("confirmPassword")).sendKeys("Rahul@123");
//		Thread.sleep(1000);
//		wd.findElement(By.name("submit")).click();
		
	
	
	//To enter multiple data in same field 
		WebElement we= wd.findElement(By.name("firstName"));
		we.sendKeys("Rahul");
		we.clear();
		Thread.sleep(4000);
		we.sendKeys("Akshay");
		Thread.sleep(4000);

		String s = we.getAttribute("value");
		System.out.println(s);


	}

}
