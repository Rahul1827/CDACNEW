#include<iostream>
using namespace std;

class MyVector
{
    private:
        float v[100];
        int size;
    public:
        MyVector() : size(0) {}

        void set_vector(int a[], int n)    
        {
            size = n;
            for(int i = 0; i < n; i++)
            {
                v[i] = a[i];
            }
        }
       
        void display() const
        {
            cout << "\nVector has: ";
            for(int i = 0; i < size; i++)
            {
                cout << v[i] << ", ";
            }
            cout << endl;
        }

       
        MyVector operator-() const
        {
            MyVector temp;
            temp.size = size;
            for(int i = 0; i < size; i++)
            {
                temp.v[i] = -v[i];
            }
            return temp;
        }

        
        friend MyVector operator+(const MyVector& d1, const MyVector& d2);
};

MyVector operator+(const MyVector& d1, const MyVector& d2)
{
    MyVector temp;
    temp.size = d1.size;
    for(int i = 0; i < d1.size; i++)
    {
        temp.v[i] = d1.v[i] + d2.v[i];
    }
    return temp;
}

int main()
{
    MyVector obj;
    int t[] = {11, -22, 33, 44, -55, 66, 77};
    int n = sizeof(t) / sizeof(t[0]);
    obj.set_vector(t, n);

    cout << "Original vector:";
    obj.display();

    MyVector negatedObj = -obj; // Use unary minus operator
    cout << "Negated vector:";
    negatedObj.display();
    
    return 0;
}
