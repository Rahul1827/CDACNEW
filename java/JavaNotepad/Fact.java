
import java.util.Scanner;

class  Fact
{


public static void  main(String args[])

{

int num, fact=1,i=0;
Scanner sc= new Scanner (System.in);
System.out.println("Enter the Number");

num=sc.nextInt();


while(num>i)
{
  fact=fact*num;
i--;


}
System.out.println("Factorial of a number"+fact);



}



}