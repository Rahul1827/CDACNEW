#include<iostream>
using namespace std;


main()
{
	int num ,f1,fo, fn;
	
	cout<<"\n Enter the number";
	cin>>num;
	
	for(int i=0;i<num;i++)
	{
		if(i<=1){
			fo=0;
			f1=1;
			
	}
	else{
	
	
  fn=fo+f1;
  fo=f1;
  f1=fn;
}
	
}
cout<<"\n "<<f1;
}