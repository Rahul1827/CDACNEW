package ExceptionHandling;
import java.util.Scanner;







public class excep {
	
	
	

public static void vali(int age)
{
	
if(age<18)
{
throw new ArithmeticException("Person is not eligible to vote")	;

}
else {
	
	System.out.println("Person is eligible to vote ");
	
}

}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int a;
System.out.println("Enter the age ");
a=sc.nextInt();


vali(a);



	}

}
