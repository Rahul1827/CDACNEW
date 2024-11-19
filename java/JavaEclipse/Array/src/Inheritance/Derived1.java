package Inheritance;

class Derived1 extends SingleInheritance{
	
	
	private int p,q;
	public
	
	Derived1()

	{
		p=200;
		q=100;
		
		
	}
	
	void  GetInfo(int x, int y)
	{
		
		
		p=x;
		q=y;
		
	}
	 
	 public void show()
	 {
		 super.show();
		 
		 System.out.println("P is ="+p);
		 System.out.println("Q is ="+q);
	 }
	
	
}

