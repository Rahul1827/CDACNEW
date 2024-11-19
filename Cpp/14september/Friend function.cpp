#include<iostream>
using namespace std;
/*
implement 2 classes
1 inch--has method set_inch
2 cm----has methid set_cm
use friend function to add inches and cm and print total in inches and cm both

*/
class inches;//forward decleration
class cm
{
    private:
        float cm_;
    public:
        void set_cm(float i)    
        {
            cm_=i;
        }
        friend void add(inches i,cm c);
};
class inches
{
    private:
        float i_;
    public:
        void set_inches(float t)    
        {
            i_=t;
        }
        friend void add(inches i,cm c);
};
void add(inches i,cm c)
{
    cout<<"\nTotal in cm:"<<(i.i_*2.5+c.cm_);
    cout<<"\nTotal in inches:"<<(i.i_+c.cm_/2.5);
}

int main()
{
 inches obj_in;
 cm obj_cm;
 obj_in.set_inches(36);
 obj_cm.set_cm(17);
 add(obj_in,obj_cm);
}