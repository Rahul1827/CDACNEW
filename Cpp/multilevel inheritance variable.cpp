#include<iostream>
using namespace std;

class A
{
	protected :
		int a;
	
	public:
		
		void A_show()
		{
			cout<<"\n Enter the value of A";
			cin>>a;
			cout<<"\n A  ="<<a;
		cout<<"\n A class";
	}
	
};

class B: public A
{
	protected :
		int b;
		
	
	public:
		void B_show(){
			
			cout<<"\n Enter the value of B";
			cin>>b;
		b=a+b;
				A::A_show();
			
		cout<<"\n B class"<<b;
}
	
};

class C : public B
{
	private:
		int ans;
	
	public:
		
		void C_show(){
		
		B::B_show();
			cout<<"\n Enter the value of ans";
			cin>>ans;
			ans=ans+b;
			cout<<"\n Answer is ="<<ans;
			
		cout<<"\n C class";
		
}
};
main()
{
	C obj;
	obj.C_show();
	
	
}
