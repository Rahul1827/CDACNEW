#include<iostream>
using namespace std;

main()

{
	int x,num, power=1;
	cout<<"\n Enter the number";
	cin>>x;
	
		cout<<"\n Enter the power";
	cin>>num;
	
	
	for(int i=0;i<num;i++)
	{
	power=x*power;
	}
	
	cout<<"\n "<<power;
}