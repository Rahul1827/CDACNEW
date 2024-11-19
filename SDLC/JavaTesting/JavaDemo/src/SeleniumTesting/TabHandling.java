package SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd= new ChromeDriver();

		wd.manage().window().maximize();
		
		String tab1=wd.getWindowHandle();
		wd.navigate().to("https://www.google.com");
		wd.switchTo().newWindow(WindowType.TAB);      //to open new blank tab in browser
		
		
		
		String tab2=wd.getWindowHandle();
		wd.navigate().to("https://www.gmail.com");
		wd.switchTo().newWindow(WindowType.TAB);
	
		
		
		

		String tab3=wd.getWindowHandle();
		wd.navigate().to("https://www.hackerrank.com");
		wd.switchTo().newWindow(WindowType.TAB);
		//to open new blank tab in browser
		
		
		

		String tab4=wd.getWindowHandle();
		wd.navigate().to("https://www.indiabix.com");
	     //to open new blank tab in browser
	
		
		wd.switchTo().window("tab4");
		wd.switchTo().window("tab1");
		wd.switchTo().window("tab2");
		wd.switchTo().window("tab3");
	wd.quit();
	

	}

}
