package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://demo.guru99.com/test/newtours/register.php");
		//wd.findElement(By.name("firstName")).sendKeys("Rahul");
		Actions act = new Actions(wd);
		WebElement w= wd.findElement(By.name("firstName"));
		w.sendKeys("Rahul");
		act.doubleClick(w).build().perform();
		act.contextClick(w).build().perform();
		
		

	}

}
