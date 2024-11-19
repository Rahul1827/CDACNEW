#include<iostream>
using namespace std;

main()
{
	
	int num, ans =0;
	 cout<<"\n enter the number";
	 cin>>num;
	 
	 for(int i=1;i<=10;i++)
	 {
	 	ans=num*i;
	 	
	 	cout<<"\n "<<num<<"*"<<i<<"="<<ans;
	 }
	 
}