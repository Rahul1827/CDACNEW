package Task;

public class C extends B {

	
	private double net=0, inc=0;

	
	
	
	
	
	public void show()


	{
		super.show();
		net = salary+bonus;
		inc=net*10/100;
		
		 System.out.println("Net Salary is ="+net);
		 System.out.println("Increment  is ="+inc);
		}
	
}
