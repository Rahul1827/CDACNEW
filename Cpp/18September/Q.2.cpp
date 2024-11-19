/*Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively
by creating a class named 'Rectangle' with a function named 'Area' which returns the area. Length */


#include<iostream>
using namespace std;
class Rectangle
{
	private:
		int l;
		int b;
	public:
		void set(int a, int c)
		{
			l=a;
			b=c;
		}

	void area()
	{
		int ans=l*b;
		cout<<"\Area of rectangle="<<l*b;
	}
};
int main()
{
	Rectangle obj;
	obj.set(4,5);
	obj.area();
}
