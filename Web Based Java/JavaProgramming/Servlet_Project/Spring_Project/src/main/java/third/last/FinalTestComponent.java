package third.last;

import org.springframework.stereotype.Component;

@Component("myFinalComp")
public class FinalTestComponent {
	//Assigning an Id: myFinalComp to this component so that it can be accessed using the same.
	
	
		public void doTest()
		{
			System.out.println("Final Test Componenet test Succeeded");
		}
	


}