
import java.util.Scanner;

class  GreaterNum
{


public static void  main(String args[])

{

int a,b,c;
Scanner sc= new Scanner (System.in);
System.out.println("Enter the first Number");

a=sc.nextInt();

System.out.println("Enter the second Number");

b=sc.nextInt();

System.out.println("Enter the third Number");

c=sc.nextInt();

if(a>b && a>c)
{

System.out.println("First number is greater");

}

else if(b>a&& b>c)
{

System.out.println("Second Number  is greater");

}


else {
System.out.println("Third Number is greater");

}






}



}