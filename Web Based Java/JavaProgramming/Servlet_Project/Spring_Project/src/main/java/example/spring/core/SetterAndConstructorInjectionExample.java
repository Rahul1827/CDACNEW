package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterAndConstructorInjectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
		Object loadedObject=context.getBean("userBean");
		GreetingService gs= (GreetingService)loadedObject;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		System.out.println("================================================");
		 loadedObject=context.getBean("userBean2");
		gs= (GreetingService)loadedObject;
		reply = gs.sayGreeting();
		System.out.println(reply);

	}

}
