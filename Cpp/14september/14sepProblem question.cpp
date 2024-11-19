//Problem Definition:
//
//Given an unsorted array of integers, find the leader element in the array. A leader element is an element that appears more than half the size of the array.
//
//Example:
//
//Consider the array [2, 1, 3, 2, 2]. The leader element is 2 because it appears 3 times, which is more than half the size of the array (5/2 = 2.5).
//
//Sample Input 1:
//
//Sample Output 1:
//
//Explanation: The element 2 appears 3 times, which is more than half the size of the array (5/2 = 2.5).
//
//Sample Input 2:
//
//Sample Output 2:
//
//Explanation: There is no element that appears more than half the size of the array.
//


#include<iostream>
#include<iomanip>
using namespace std;
//check and return pairs for whom addition in part of array
//a=[1,2,3,4,5,6]
//pairs are (1,2)(1,3)(1,4)(1,5)(2,3)(2,4)
//also give total count

int search(int a[],int size,int key)
{
    int i;
    for(i=0;i<size;i++)
    {
        if(key==a[i])
            return 1;//yes
    }
    return 0;
}

void pairs(int a[],int size)
{
    int count=0;
    for(int i=0;i<size;i++)
    {
        for(int j=i+1;j<size;j++)
        {
            if(search(a,size,a[i]+a[j])==1)
            {
                cout<<"\n("<<a[i]<<","<<a[j]<<")";
                count++;
            }
        }
    }
    cout<<"\nTotal of "<<count<<" pairs";
}
int main()
{
    int a[]={2,1,4,3,6,5};
    int size=6;
    pairs(a,size);

   
   
 return 1;
}






