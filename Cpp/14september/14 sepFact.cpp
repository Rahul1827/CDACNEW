#include<iostream>
using namespace std;

main()

{
	int num, fact=1;
	
	cout<<"\n Enter the number";
	cin>>num;
	
	for(int i=0;i<=num;i++)
	{
		fact=fact*i;
	}
	
	cout<<"\n factorial is ="<<fact;
}