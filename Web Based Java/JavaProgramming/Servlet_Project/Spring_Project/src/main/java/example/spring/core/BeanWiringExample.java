package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanWiringExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring-config2.xml");
		Object customerObj=context.getBean("myCustomer");
		System.out.println(customerObj);

	}

}
