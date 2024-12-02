package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config3.xml");
		Object obj=context.getBean("bean1"); //Requesting 1st time.
		Object obj2=context.getBean("bean1");
		System.out.println("Same object ?" +(obj==obj2));

	}

}
