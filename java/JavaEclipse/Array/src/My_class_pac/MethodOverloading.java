package My_class_pac;

public class MethodOverloading {

	private 
	int a,b,c;
	String s1,s2;
	float x;
	
	public
	
	int Get(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		
		return a+b+c;
		
	}
	
	float Get(float x)
	{
		
		this.x=x;
		return x;
		
	}
	void Get(String s1)
	{
		this.s1=s1;
	
		
		
	System.out.println("String is ="+s1);
		
		
	}
	

	
}
