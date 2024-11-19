package NGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void first() {
	  System.out.println("I am in Test case");
  }
  @Test
  public void Second() {
	  System.out.println("I am in Test case");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am in  before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am in  after Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am in  before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am in  after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am in  before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am in  after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am in  before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am in  after suite");
  }

}










//public class ActionClass {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		WebDriver wd = new ChromeDriver();
//		
//		wd.get("https://demo.guru99.com/test/newtours/register.php");
//		//wd.findElement(By.name("firstName")).sendKeys("Rahul");
//		Actions act = new Actions(wd);
//		WebElement w= wd.findElement(By.name("firstName"));
//		w.sendKeys("Rahul");
//		act.doubleClick(w).build().perform();
//		act.contextClick(w).build().perform();
//		
//		
//
//	}
//
//}




//package SeleniumTesting;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class AlertButton {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		WebDriver wd = new ChromeDriver();
//		wd.get("https://demoqa.com/alerts");
//
////		wd.findElement(By.id("alertButton")).click();
////		
////		Thread.sleep(4000);
////Alert al= wd.switchTo().alert();
////
////String s = al.getText();
////System.out.println(s);
////	al.accept();
//	
//	
//	wd.findElement(By.id("promtButton")).click();
//	
//	
//Alert al= wd.switchTo().alert();
//Thread.sleep(4000);
//al.sendKeys("Rahul");
//
//String s = al.getText();
//System.out.println(s);
//al.accept();
//
//	
//	
//
//
//	
//
//	}
//
//}






//
//package SeleniumTesting;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class DragDrop {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		
//		WebDriver wd = new ChromeDriver();
//		
//		wd.get("https://demo.guru99.com/test/drag_drop.html");
//		Actions act = new Actions(wd);
//		WebElement drag=wd.findElement(By.id("fourth"));
//		Thread.sleep(2000);
//		WebElement drop =wd.findElement(By.id("amt7"));
//		
//		//WebElement w= wd.findElement(By.id(""));
//		act.dragAndDrop(drag, drop).build().perform();
//
//	}
//
//}


//package SeleniumTesting;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class RadioButton {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		
//		WebDriver wd= new ChromeDriver();
//		
//		wd.get("https://demo.guru99.com/test/radio.html");
//		
//		WebElement we= wd.findElement(By.id("vfb-7-3"));
//		we.sendKeys("option3");
//		we.click();
//		
//	WebElement we1= wd.findElement(By.id("vfb-6-2"));
//		we1.sendKeys("checkbox3");
//		we1.click();
//		
//	
//		
//	}
//
//}






