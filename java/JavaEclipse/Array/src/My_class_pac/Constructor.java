package My_class_pac;

public class Constructor {

	private
	int a;
	float b;
	String name;
	public
	
	Constructor()
	{
		
		a=45;
		b=50.21f;
		
		
		
	}
	Constructor(int x )
	{
	this.a=a;
	
		
		
		
	}

	
	Constructor(int a , float b, String name)
	{
		
	
		this.a=a;
		this.b=b;
		this.name=name;
		
		
	}
	
	
	void Show()

	{
		
		System.out.println("A is ="+a);
		System.out.println("B is ="+b);
		System.out.println("Name  is ="+name);
		
	}
	
}
