#include<iostream>
#include<iomanip>
using namespace std;


main()
{    

	for(int space=5,i=1;i<=5;space++,i--)
	{
		
		cout<<setw(space)<<setfill(' ')<<""<<setw(i)<<setfill('X')<<endl;
	}
	
}