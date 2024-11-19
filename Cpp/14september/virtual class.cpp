#include<iostream>
using namespace std;
//virtual method/pure virtual method
//method that makes override must in derived class
//way to enforce certain method to be there is a class
class human
{
    public:
       virtual void live()=0;
        virtual void study()=0;
       virtual void eat()=0;
       
};
//one who inherits human must implement all virtual methods
class you:public human
{
 public:
     void live()
     {
         cout<<"\nYou : live";
     }
    void study()
        {
         cout<<"\nYou : study";
        }
       
    void eat()
        {
            cout<<"\nYou : eat";
        }
};

int main()
{
you obj;
obj.live();
obj.eat();
obj.study();
   
 return 1;
}