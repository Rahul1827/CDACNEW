package example.spring.core.without_xml;

import java.util.Collection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigurationExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		AnnotationConfigApplicationContext context=new  AnnotationConfigApplicationContext(SpringConfig.class);
		Object loadedObject= context.getBean("myMessage");
		MessageImpl mi= (MessageImpl)loadedObject;
		mi.printMessage("Welcome","Rahul!!");
		
		
		System.out.println("==================================================");
		loadedObject = context.getBean("allCourses");
		Collection<String> allAvailableCourses =(Collection<String>)loadedObject;
		allAvailableCourses.stream().forEach(course -> System.out.println(course.toUpperCase()));
		
		System.out.println("===================================================");
		Object obj1=context.getBean("myTest");
		Object obj2=context.getBean("myTest");
		System.out.println("Same Object :" +(obj1 ==obj2));
		
		
	
	}

}
