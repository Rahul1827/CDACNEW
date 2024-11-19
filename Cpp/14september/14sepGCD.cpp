#include<iostream>
using namespace std;

main()

{
	int num1,num2,temp;
	int n1,n2;
	
	cout<<"\n Enter the number one";
	cin>>num1;
	
	cout<<"\n Enter the number two";
	cin>>num2; 
	n1=num1,n2=num2;
	
	
	while (num1%num2 !=0)
	{
		
	temp=num1;
	num1=num2;
	
		num2=temp%num2;
	}
	cout<<"\nGCD  "<<num2;
	cout<<"\nLCM "<<(n1*n2)/num2;
}