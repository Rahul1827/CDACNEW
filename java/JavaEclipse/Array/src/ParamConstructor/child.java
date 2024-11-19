package ParamConstructor;

public class child extends Parent{

	private int p,q;
	public
	
	child()

	{
		p=200;
		q=100;
		
		
	}
	
	child(int w, int x, int y, int z)
	
	{
		
		super.show();
		p=y;
		q=z;	
		
	}
	 
	
	
	void show()

	{
		
		
		 
		 System.out.println("P is ="+p);
		 System.out.println("Q is ="+q);
		
	}
	
	
	
	
}

