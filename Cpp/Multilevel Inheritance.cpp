#include<iostream>
using namespace std;

class A
{
	
	public:
		
		void A_show()
		{
		cout<<"\n A class";
	}
	
};

class B: public A
{
	
	public:
		void B_show(){
				A::A_show();
			
		cout<<"\n B class";
}
	
};

class C : public B
{
	
	public:
		
		void C_show(){
		
			B::B_show();
		cout<<"\n C class";
		
}
};
main()
{
	C obj;
	obj.C_show();
	
	
}
