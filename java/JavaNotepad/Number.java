
import java.util.Scanner;

class  Number
{


public static void  main(String args[])

{

int num, even=0, odd=0,a=1;
Scanner sc= new Scanner (System.in);

System.out.println("Enter the Number");

num=sc.nextInt();


while(a<=num){
a++;
if(num%2==0)
{
even++;
}

else{
odd++;
}

}



}



}