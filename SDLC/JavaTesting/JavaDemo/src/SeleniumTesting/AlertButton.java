package SeleniumTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		wd.get("https://demoqa.com/alerts");

//		wd.findElement(By.id("alertButton")).click();
//		
//		Thread.sleep(4000);
//Alert al= wd.switchTo().alert();
//
//String s = al.getText();
//System.out.println(s);
//	al.accept();
	
	
	wd.findElement(By.id("promtButton")).click();
	
	
Alert al= wd.switchTo().alert();
Thread.sleep(4000);
al.sendKeys("Rahul");

String s = al.getText();
System.out.println(s);
al.accept();

	
	


	

	}

}
