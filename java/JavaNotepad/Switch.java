
import java.util.Scanner;

class Switch
{


public static void  main(String args[])

{

int choice;
int a,b,c;
Scanner sc= new Scanner (System.in);
System.out.println("Enter the choice");
System.out.println("1. Addition");
System.out.println("2. Substraction");

System.out.println("3.Multiplication");
System.out.println("4.Divide");
choice=sc.nextInt();

switch(choice)
{
 case 1:

System.out.println("Enter the first Number");
a=sc.nextInt();

System.out.println("Enter the Second Number");
b=sc.nextInt();

c=a+b;
System.out.println("Addition of two Number is ="+c);
 break;


case 2:

System.out.println("Enter the first Number");
a=sc.nextInt();

System.out.println("Enter the Second Number");
b=sc.nextInt();

c=a-b;
System.out.println("Substraction of two Number is ="+c);
 break;

case 3:

System.out.println("Enter the first Number");
a=sc.nextInt();

System.out.println("Enter the Second Number");
b=sc.nextInt();

c=a*b;
System.out.println("Multiplicatio of two Number is ="+c);
 break;

case 4:

System.out.println("Enter the first Number");
a=sc.nextInt();

System.out.println("Enter the Second Number");
b=sc.nextInt();

c=a/b;
System.out.println("Division of two Number is ="+c);
 break;

default:
System.out.println("Invalid choice");

}

}

}