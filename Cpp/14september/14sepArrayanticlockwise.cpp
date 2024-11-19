#include<iostream>
#include<iomanip>
using namespace std;
void print_array(int a[],int size)
{
    cout<<"\nArray has:";
    for(int i=0;i<size-1;i++)
    {
        cout<<a[i]<<",";
    }
}
void clockwise_rotate(int a[],int size,int rotate_for)
{
    int temp,i,r;
    r=0;
    while(r<rotate_for)
        {
            temp=a[size-1];//cavity
            for(i=size-1;i>0;i--)
            {
                a[i]=a[i+1];
            }
            a[size-1]=temp;
            r++;
            print_array(a,size);
        }
}
int main()
{
    int a[]={11,22,33,44,55};
    int size=5;
    int rotation;
    print_array(a,size);
    cout<<"\nEnter number of rotation:";
    cin>>rotation;
    clockwise_rotate(a,size,rotation);
    print_array(a,size);

   
   
 return 1;
}