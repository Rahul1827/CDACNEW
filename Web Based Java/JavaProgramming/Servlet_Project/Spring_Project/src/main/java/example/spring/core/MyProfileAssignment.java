package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyProfileAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring-config4.xml");
		Object myprofile=context.getBean("myProfile");
		System.out.println(myprofile);
			
	}

}
