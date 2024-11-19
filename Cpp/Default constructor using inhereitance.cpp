#include<iostream>
using namespace std;


class A
{
	private :
		int a;
		float b;
		
		public:
			
			A()
		{
			
			a=45;
			b=50.25;
		}
		
			
			void show()
			{
				
				cout<<"\n A="<<a<<"\n B="<<b;
			}
	
};


class B: public A
{
	
	private:
		
		int x,y;
		
		
		public:
			
			
			
			B()
			{
				
				x=52;
				y=85;
				
				
			}
	
	void show ()
{
	             A::show();
				cout<<"\n X="<<x<<"\n Y="<<y;
	
	}	
};


main ()

{
	
	B obj;
	obj.show();
	
}