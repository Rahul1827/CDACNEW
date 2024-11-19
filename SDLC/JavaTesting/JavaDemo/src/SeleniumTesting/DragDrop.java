package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://demo.guru99.com/test/drag_drop.html");
		Actions act = new Actions(wd);
		WebElement drag=wd.findElement(By.id("fourth"));
		Thread.sleep(2000);
		WebElement drop =wd.findElement(By.id("amt7"));
		
		//WebElement w= wd.findElement(By.id(""));
		act.dragAndDrop(drag, drop).build().perform();

	}

}
