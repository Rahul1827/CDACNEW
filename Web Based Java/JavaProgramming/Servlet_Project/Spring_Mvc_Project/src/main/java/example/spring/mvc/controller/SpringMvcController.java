//package example.spring.mvc.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller // Make this class as a controller of spring MVC Application
//public class SpringMvcController {
//	@RequestMapping("/doGreet") // provide mapping between url and and mapping
//	public String getIndexPage() {
//		System.out.println("Inside getIndexPage()");
//		return "index"; // Returning a view name
//
//	}
//	
//	@RequestMapping("/doLogin")
// public String getLoginPage()
// {System.out.println("Inside getLoginPage()");
//		
//		return "login";
//		
// }
//}



package example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  //Marks this class as a Controller of Spring MVC application
public class SpringMvcController {

    @RequestMapping("/doGreet") //providing mapping between the URL and mapping
	public String getIndexPage(){
		System.out.println("Inside the index");
		return "index"; //Returning a view name
	}


    @RequestMapping("/doLogin") //providing mapping between the URL and mapping
	public String getLoginPage(){
		System.out.println("Inside the login page");
		return "Login"; //Returning a view name
	}
    
    @RequestMapping("/doValidate")
    public String getRequestPage(@RequestParam("uid") String userName, @RequestParam("pwd") String password)
    {
    	
    	//This metho------------------------------------------------------------------------------------------------------------------------------------------------*--------------------------------d returns one of the 2 possile result pages:
    	//Success and failure depending upon user's validity
    	
    	String resultPage ="failure";
    	//Check the validity of the user and if valid, set resultPage to success
    	return resultPage;
    }



}
