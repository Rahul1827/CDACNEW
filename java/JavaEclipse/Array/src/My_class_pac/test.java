package My_class_pac;
import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MethodOverloading m1=new MethodOverloading();
//		int method=m1.Get(2, 1, 4);
//		System.out.println(method);
//		float method2=m1.Get(2.2f);
//		System.out.println(method2);
//		m1.Get("Hello");
//		System.out.println(m1.s1);
//		
//		   
		
////		
//		Constructor c1=new Constructor();
//		c1.Show();
//		Constructor c2=new Constructor(20 );
//		c2.Show();
//		Constructor c3=new Constructor(10,20.5f,"Rahul");
//		
//		
//		
//		c3.Show();
//	
//		p1.show();
//		p2.show();
//		p3.show();

//		double total=0;
//		double average=0;
//		double max=0;
//		int max_i=0;
//		
//		
//		Employee emp[]=new Employee[10];
//		
//		for(int i=0;i<2;i++)
//		{
//			
//			emp[i]=new Employee();
//			emp[i].Set_data();
//			total=total+emp[i].comp();
//			
//			
//		}
//		average=total/2;
//		System.out.println("Employee Information");
//		
//		   System.out.printf("%-15s %-20s %-10s%n", "Employee ID", "Employee Name", "Employee Salary");
//		
//		for(int i=0; i<2;i++)
//		{
//			
//			emp[i].show();
//			System.out.println("=================================================");
//			
//			if(emp[i].comp()>0)
//			{
//				max=emp[i].comp();
//				max_i=i;
//				
//			}
//			
//		}
//		System.out.println("Total salary is ="+total);
//		System.out.println("=================================================");
//		System.out.println("Average salary is ="+average);
//		System.out.println("=================================================");
//		 System.out.printf("%-15s %-20s %-10s%n", "Employee ID", "Employee Name", "Employee Salary");
//		 emp[max_i].show();	
		
		Scanner sc= new Scanner(System.in);
		int numberOfStudents;
		
		System.out.println("Enter the num of students");
		
		numberOfStudents=sc.nextInt();
		
		Student[] std=new Student[numberOfStudents];
		
		for(int i=0;i<numberOfStudents;i++)
		{
			
			std[i]=new Student();
			std[i].setData();
		}
		
		
		

		for(int i=0;i<10;i++)
		{
			std[i].showData();
		}
		
		Student std1=new Student();
		
		std1.top3(std,numberOfStudents);
	
		
//		
	}

}
