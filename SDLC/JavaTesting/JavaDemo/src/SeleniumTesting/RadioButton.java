package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver wd= new ChromeDriver();
		
		wd.get("https://demo.guru99.com/test/radio.html");
		
		WebElement we= wd.findElement(By.id("vfb-7-3"));
		we.sendKeys("option3");
		we.click();
		
	WebElement we1= wd.findElement(By.id("vfb-6-2"));
		we1.sendKeys("checkbox3");
		we1.click();
		
	
		
	}

}
