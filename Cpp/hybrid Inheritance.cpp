#include<iostream>

using namespace std;

class A{
	
	public:
		
		void A_show(){
		
		cout<<"\n A class";
	
}
	
};

class B: public A
{  public:

		void B_show(){
			
			A::A_show();
		
		cout<<"\n B class";
	
}
	

};

class C: public A
{
	public:
		
		void C_show(){
		A::A_show();
		cout<<"\n C class";
}
	
};


class D : public B , public C 
{
  public:
		
		void D_show(){
			B::B_show();
			C::C_show();
			
		
		cout<<"\n D class";
	}
	

};

main()
{
 D obj;
 
 obj.D_show();
}



