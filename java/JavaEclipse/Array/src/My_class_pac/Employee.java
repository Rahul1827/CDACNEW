package My_class_pac;
import java.util.Scanner;
public class Employee {
	
	
	private
	int empid;
	String name;
	double salary;
	
	public 
	
	
	Scanner sc= new Scanner(System.in);
	void Set_data()
	{
		System.out.println("Enter the Employee id");
		empid=sc.nextInt();
		System.out.println("Enter the Employee name");
		name=sc.next();
		System.out.println("Enter the Employee Salary");
		salary=sc.nextDouble();
		
	
		
	}
	
	double comp()
	{
		
		return (salary);
	}
	
	public void show() {
	    System.out.printf("%-15s %-10s %-10.2f%n", this.empid, this.name, this.salary);
	}

	
//	void show()
//	{
//		System.out.println("Employee Id is ="+empid);
//		System.out.println("Employee Name is ="+name);
//		System.out.println("Employee Salary is ="+salary);
//	}
//	
	
	

}
