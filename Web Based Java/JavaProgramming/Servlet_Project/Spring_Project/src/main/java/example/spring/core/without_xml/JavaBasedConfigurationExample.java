package example.spring.core.without_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigurationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(); 
		new AnnotationConfigApplicationContext();
		
		//Registering the configuration unit: SpringConfig with 'context'
		context.register(SpringConfig.class);
		//Refreshing the context to apply the changes.
		context.refresh();
		
		Object loadedObject= context.getBean("getGreetingImpl");
		GreetingImpl gi= (GreetingImpl)loadedObject;
		gi.doGreet();
		

	}

}
