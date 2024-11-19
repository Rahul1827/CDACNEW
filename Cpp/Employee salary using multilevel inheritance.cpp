#include<iostream>
using namespace std;

class Employee
{
	protected:
		int salary;
		
		private:
			int empno;
			string name;
			
			public:
				void Get()
				{
					cout<<"\n enter the employee no";
					cin>>empno;
					
					cout<<"\n enter the employee name";
					cin>>name;
					
					cout<<"\n enter the employee Salary";
					cin>>salary;
					
					
				}
				
				void Show()
				{
					cout<<"\n Employee Number ="<<empno;
					cout<<"\n Employee Name ="<<name;
					cout<<"\n Employee Salary ="<<salary;
					
				}
	
};


class Bonus : public Employee
{
	protected:
		int bonus;
		public:
			int total;

	
	void Bonus_show()
	{
		Employee::Get();
		Employee::Show();
		total=salary;
		bonus=(total*10)/100;

	
        cout<<"\n bonus is ="<<bonus;	
	}	
};
	



class Net_payment : public Bonus
{
	private:
		int net_salary,ans, total1;
		
		public:
			
		
			void Get_show(){
				
			Bonus::Bonus_show();
			
			ans=salary;
			total1=bonus;
		//	net_salary=ans+total;
				
			cout<<"\n Net salary is ="<<ans+total1;
			
		}
	
};

main()
{
	Net_payment obj;
	obj.Get_show();
	
}
