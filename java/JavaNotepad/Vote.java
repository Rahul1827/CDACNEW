
import java.util.Scanner;

class  Vote
{


public static void  main(String args[])

{

int age;
Scanner sc= new Scanner (System.in);
System.out.println("Enter the age");

age=sc.nextInt();

if(age>=18)
{

System.out.println("Person is eligible to vote");

}

else {
System.out.println("Person is not eligible to vote");

}






}



}