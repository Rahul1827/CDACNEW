//Assignment 3: Door Access Control
//Write a program that simulates an access control system.
//A person is allowed access if they have both a valid ID and a valid access card,
//or if they are an admin.
//Requirements:
//•    Use logical operators &&, ||, and !.
package Assignment1;

import java.util.Scanner;

public class Ques3 {
	
	private String name;
	private char id, access, role ;
	
	
	Scanner sc=new Scanner(System.in);
	

	public void getStudentInfo ()
	{
		
		System.out.println("You have a valid id ?  please write 'Y' or 'N'");
		id=sc.next().charAt(0);
				
		
		
		System.out.println("You have a valid access card ?  please write 'Y' or 'N'");
		access=sc.next().charAt(0);
		
		System.out.println("Are you admin ? Please write 'Y' or 'N'");
	 role=sc.next().charAt(0);
		
	}
	
	public void  checkAccess()

	{
		
		if((id == 'Y' || id == 'y') && (access == 'Y' || access == 'y') || (role == 'Y' || role == 'y'))//(id =='y' || id=='Y' && role =='y' ||role =='Y')
		{
			
			System.out.println("Thank you for input !!!!  You are allowed to enter");
		}
		
		else {
			
			System.out.println("Sorry you dont have a valid id or access card!!! Try again later!!");
			
		}
		
	}
	
	public void display()
	{
		
		
		
	
	}
}
