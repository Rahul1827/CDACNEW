package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExample {

	public static void main(String[] args) {
		//Retrieving the bean from spring-config-xml against its ID:MyBean
		
		ApplicationContext context;
		String filepath="./src/main/resources/Spring-config.xml";
		context= new FileSystemXmlApplicationContext(filepath);
		Object loadedObject=context.getBean("myBean");
	GreetingService gs =(GreetingService)loadedObject;
		//HelloService gs=(HelloService)loadedObject;
		//WelcomeService gs=(WelcomeService)loadedObject;
	String reply = gs.sayGreeting();
	System.out.println(reply);
	
	
	
	System.out.println("==============================================");
	GreetingService gs2 = new WelcomeService();
	System.out.println(gs.sayGreeting());
	
	
	/*
	 * In this example both the objects referred by 'gs' and 'gs2' are 
	 * the components but 'gs' is obtained through Spring's environment
	 * where 'gs2'  is not.
	 * Therefore 'gs' becomes a Managed Component and 'gs2'
	 */

	}

}
