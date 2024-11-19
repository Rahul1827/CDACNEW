




package NGTest;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabExam {

	public static void main(String[] args) {
	   
 WebDriver wd=new ChromeDriver();

 wd.get("https://parabank.parasoft.com/parabank/register.htm");
 System.out.println(wd.getCurrentUrl());
 System.out.println(wd.getTitle());
 wd.manage().window().maximize();
 
 
 wd.findElement(By.xpath("//a[contains(text)],'Register'")).click();

 
// wd.findElement(By.name("customer.firstName")).sendKeys("Rahul");
 WebElement w1= wd.findElement(By.name("customer.firstName"));
 w1.sendKeys("Rahul");
 System.out.println(w1.getAttribute("value"));
 

 
 WebElement w2= wd.findElement(By.name("customer.lastName"));
 w2.sendKeys("Patil");
 System.out.println(w2.getAttribute("value"));
 
 
 wd.findElement(By.name("customer.address.street")).sendKeys("21-Sec B Shri ram Nagar Colony Gujarkheda mhow ");
 wd.findElement(By.name("customer.address.city")).sendKeys("Indore");
 wd.findElement(By.name("customer.address.state")).sendKeys("Madhya Pradesh");
 wd.findElement(By.name("customer.address.zipCode")).sendKeys("453441");
 wd.findElement(By.name("customer.ssn")).sendKeys("2544565454");
 wd.findElement(By.name("customer.phoneNumber")).sendKeys("7067332884");
 wd.findElement(By.name("customer.username")).sendKeys("Rahul");
 wd.findElement(By.name("customer.password")).sendKeys("Rahul@123");
 wd.findElement(By.name("repeatedPassword")).sendKeys("Rahul@123");
 wd.findElement(By.xpath("//input[@name='repeatedPassword']//following::input[1]")).click(); 

 


	}

}





