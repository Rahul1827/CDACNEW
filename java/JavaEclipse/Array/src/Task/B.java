package Task;

public class B extends A{

	
	protected double bonus;
	
	public
	
	void GetBonus(double x)
	{
		
		bonus=x;
		
	}
	
	public void show()

	{
		super.show();
		
		bonus=0.10*salary;
		System.out.println("Bonus is ="+bonus);
	}
}
