package example.spring.core.without_xml;

import java.beans.BeanProperty;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration //Marks this class as a Configuration unit.
//@ComponentScan
@ComponentScan(basePackages={"another","third","example"})
public class SpringConfig {
	@Bean
	public GreetingImpl getGreetingImpl() {
		
		GreetingImpl gi=new GreetingImpl();
		return gi;
		
	}
	//Configuring a bean of type MessageImpl with some different ID:myMessage
	
	@Bean("myMessage")//Changing the default Id to "myMessage". 
	public MessageImpl getMessageImpl() {
		MessageImpl mi = new MessageImpl();
		return mi;
	}
	
	//Configuring a bean of type :java.util.Collection
	@Bean("allCourses")
	public Collection<String>getCourseList()
	{
		Collection<String> courseList= Arrays.asList("Core java", "Spring","Angular","React","AWS");
		return courseList;
	}
	
	
	
	@Bean("myTest")
	@Lazy //Marks this bean 
	@Scope
	public TestImpl getTestImpl()
	{  TestImpl ti = new TestImpl();
		return ti;
	}

}
