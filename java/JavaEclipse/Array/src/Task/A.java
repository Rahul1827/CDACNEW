package Task;

public class A {
	
	private
	
	int empid;
	String name;
	protected
	double salary;
	
	
	

	void GetA(int eid, String na, double sal)
	{
		
		empid=eid;
		name=na;
		salary= sal;
		
		
	}
	
	public 
	void show()

	{
		System.out.println("Employee is is ="+empid);
		System.out.println("Employee Name"+name);
		System.out.println("Emplouyee Salary"+salary);
	}
}
