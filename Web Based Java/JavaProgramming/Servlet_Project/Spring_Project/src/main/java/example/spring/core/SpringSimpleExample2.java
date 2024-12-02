package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSimpleExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context;
		String fileName ="Spring-config.xml";
		context = new ClassPathXmlApplicationContext(fileName);
		Object loadedObject = context.getBean("myBean");
		GreetingService gs= (GreetingService)loadedObject;
		String reply=gs.sayGreeting();
		System.out.println(reply);

	}

}
