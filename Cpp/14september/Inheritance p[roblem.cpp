#include<iostream>
using namespace std;

class Human{
	
	protected:
	string name,gender;
	
	
	
};

class Study :public Human{
	
	protected:
		 string degree;
		 
		
	
	
	
};

class Job :public Study{
	
	double salary;
	
	public:
	void GetSalary(string na, string ge, string degr ,double sal)
	
{
	name=na;
	gender =ge;
	degree= degr;
	salary= sal;
	
	cout<<"\n Name"<<nam<<"\nGender \t"<<gender<<"\n degree\t"<<deg<<"\n Salary\t"<<sal;
	
	}	
};


main()

{
	Job j;
	j.GetSalary("Rahul","Male","Btech",20000);
	
	
}