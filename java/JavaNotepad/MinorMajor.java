
import java.util.Scanner;

class MinorMajor
{


public static void  main(String args[])

{

int age;
Scanner sc= new Scanner (System.in);
System.out.println("Enter the Age");

age=sc.nextInt();


if(age>=0 && age<=17)
{

System.out.println("Minor Person");

}

else if(age>=18 && age<=59)
{

System.out.println("Major Person");

}


else if(age>=60 && age<=100){
System.out.println("Senior Citizen");

}
else {
System.out.println("Invalid Age");


}
}

}