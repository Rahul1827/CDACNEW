
import java.util.Scanner;

class  SumOdDigit
{


public static void  main(String args[])

{

int num, sum=0,a=1;
Scanner sc= new Scanner (System.in);
System.out.println("Enter the Number");

num=sc.nextInt();

while(a<=num)

sum=sum+a;
a++;
}
System.out.println("Sum of a number"+sum);



}



}