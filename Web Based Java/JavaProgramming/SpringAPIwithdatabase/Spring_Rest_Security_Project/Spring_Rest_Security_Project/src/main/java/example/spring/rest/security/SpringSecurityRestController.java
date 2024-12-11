package example.spring.rest.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityRestController {
	@GetMapping("/doGreet") // This resource does not need security
	public String getGreetings()
	{
		return "welcome to spring Security";
	}
	
	@GetMapping("/doAdminWork")//This resource is accessible only to ADMIN users
	public String doAdminWork()
	{
		return "Doing admin work";
	}
	
	@GetMapping("/doRegularWork")//This resource is accessible to ADMIN as well as REGULAR users
	public String doRegularWork()
	{
		return "Doing regular work";
	}

}
