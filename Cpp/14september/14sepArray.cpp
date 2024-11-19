#include<iostream>
#include<iomanip>
using namespace std;
void clockwise_rotate(int a[],int size,int rotate_for)
{
    int temp,i,r;
    r=0;
    while(r<rotate_for)
        {
            temp=a[0];//cavity
            for(i=0;i<size-1;i++)
            {
                a[i]=a[i+1];
            }
            r++;
        }
        
        for(int i=0;i<size;i++)
        {
        	temp=a[i];
        	cout<<"\n"<<a[i];
		}
}
int main()
{
    int a[]={11,22,33,44,55};
    int size=5;
    int rotation;
    cout<<"\nEnter number of rotation:";
    cin>>rotation;
    clockwise_rotate(a,size,rotation);
    
    
    //print
    return 0;
}
   
   
 
