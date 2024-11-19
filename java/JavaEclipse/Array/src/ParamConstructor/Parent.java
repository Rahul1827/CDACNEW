package ParamConstructor;

public class Parent {


	
	private int a,b;

	
	public
	Parent()

	{
		
		a=5;
		b=10;
		
	}
	
	Parent(int x, int y)
	{
		
	a=x;
	b=y;
		
		
	}
		
		
		
	
	
         void show()	
         {
        	 System.out.println("A is ="+a);
        	 System.out.println("B is ="+b);
        	 
        	 
         }
	
	

}
