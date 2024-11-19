#include<iostream>

using namespace std;

main()
{  int num, flag=1;

	cout<<"\n Enter the number";
	cin>>num;
	
	for(int i=2;i<num;i++)
	{
		
		if(num%2==0)
		{
			flag=0;
			break;
		}
	
		
	}
		if(flag==1)
		{
			cout<<"\n The number is prime";
		}
		else
		{
			cout<<"\n The number is not prime";	
		}
	
	
}