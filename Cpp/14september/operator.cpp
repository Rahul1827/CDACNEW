#include<iostream>
using namespace std;
/*
operator overload:
- gives more functionality to exisiting operators
-can overload unary/binary opertor
ex    -a unary   a-b binary
-function called on its own with symbol only
    add 2 inches  + can only add int/float
    overload + operator to do so
-operator+(inches i1,inches i2)
- inches i1,i2;
-i1+i2--------->operator+(inches i1,inches i2)
*/
class inches
{
    private:
        float value;
    public:
        void set_inches(float i)    
        {
            value=i;
        }
        friend void operator+(inches d1,inches d2);
};

void operator+(inches d1,inches d2)
{
  cout<<d1.value<<"+"<<d2.value<<"="<<(d1.value+d2.value);
}

int main()
{
 inches obj1,obj2;
 obj1.set_inches(7.9);
 obj2.set_inches(11.3);
 obj1+obj2;//call: operator+(obj1,obj2);
}