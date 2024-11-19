package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		WebDriver wd= new ChromeDriver();
		
		wd.get("https://www.jotform.com/42382403598964");
		
		wd.findElement(By.name("q3_name")).sendKeys("Rahul");
		wd.findElement(By.name("q4_email")).sendKeys("Rahul.patil.sbg@gmail.com");
		
		WebElement we=null;		
	Select sr = new Select(wd.findElement(By.name("q7_birthday[month]")));	
	sr.selectByVisibleText("November");
	
	WebElement we1=null;		
	Select sr1 = new Select(wd.findElement(By.id("input_7_day")));	
	sr1.selectByVisibleText("18");
	
	WebElement we2=null;		
	Select sr2 = new Select(wd.findElement(By.id("input_7_year")));	
	sr2.selectByVisibleText("1999");
	
	wd.findElement(By.name("q5_address5[addr_line1]")).sendKeys("Shri ram nagar colony Gujarkheda");
	wd.findElement(By.name("q5_address5[addr_line2]")).sendKeys("Mhow");
	
	wd.findElement(By.name("q5_address5[city]")).sendKeys("Indore");
	
	wd.findElement(By.name("q5_address5[state]")).sendKeys("Madhya Pradesh");
	wd.findElement(By.name("q5_address5[postal]")).sendKeys("453441");
	
	Select sr25= new Select(wd.findElement(By.name("q5_address5[country]")));	
	sr25.selectByVisibleText("India");
	
	wd.findElement(By.id("input_2")).click();
	
	
	

	}

}
