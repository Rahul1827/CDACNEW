package example.spring.core.without_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import another.AnotherTestComponent;
import third.ThirdComponent;
import third.last.FinalTestComponent;
import third.last.LastTestComponent;

public class PureAnnotationBasedConfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
		TestComponent testComp =context.getBean(TestComponent.class);
		testComp.doTest();

		System.out.println("*************************************************************");
		
		AnotherTestComponent anotherTestComp= context.getBean(AnotherTestComponent.class);
		anotherTestComp.doTest();
		
		
		System.out.println("*************************************************************");
		
		ThirdComponent thirdComp = context.getBean(ThirdComponent.class);
		thirdComp.doTest();
		
		System.out.println("*************************************************************");
		
		LastTestComponent lastComp = context.getBean(LastTestComponent.class);
		lastComp.doTest();
		
System.out.println("*************************************************************");
		
		Object loadedObject = context.getBean("myFinalComp");
		FinalTestComponent finalComp=(FinalTestComponent)loadedObject;
		finalComp.doTest();
	


	}

}
