package SeleniumTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd=new ChromeDriver();
//		wd.get("https://www.google.com");
//		wd.get("https://www.email.com");
		wd.get("https://www.demoblaze.com");
		
		
//		WebDriver wd1=new ChromeDriver();
//		wd1.get("https://www.gmail.com");
		
		
		wd.manage().window().maximize();  // to maximize the window automatically
		//wd1.manage().window().minimize();   // to minimum the window automatically
		
		
//	
//		String s= wd.getTitle();
		//System.out.println(s);
//		String s1=wd1.getTitle();
		
		//System.out.println(wd.getCurrentUrl());
		
		
//		if(wd.getCurrentUrl()==wd1.getCurrentUrl())
//		{
//			
//			System.out.println("pass");
//		}
//		else 
//		{
//			
//			System.out.println("Fail");
//		}
		
		
//		wd.navigate().back();
//		
		
	

	}

}
