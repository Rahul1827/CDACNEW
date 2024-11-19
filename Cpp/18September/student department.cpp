//10. Composition: - Question: Create a Department class that contains a list of
//Student objects using composition to represent a "has-a" relationship between
//classes. - Logic: Instantiate objects of one class within another to represent a
//containment relationship. - Sample Input: N/A - Expected Output: N/A

//#include <iostream>
//using namespace std;
//class student{
//	
//	private:
//		
//		string name, gender;\
//		int student_id;
//		
//		public:
//			
//			void set_details(string na,string ge , int sid)
//		{
		name=na;
		gender=ge;
	student_id=sid;		
//		}	
//		void Display()
//		{
//			cout<<"\n Name " <<name <<" Gender "<<gender <<"Student Id "<<student_id<<endl;
//		}
//	
//};
//
//class department : public student{
//	
//	private:
//		student s1;
//		
//		public:
//	
//		
//			void set_dep(string na,string ge , int sid)
//		{
//			s1.set_details(name,gender,student_id);
//			
//		}
//		
//		void display()
//		{
//			s1.Display();
//		}
//		
//	s1.set_details("rahul","Male",23);
//	s1.Display();
//	
//	
//};
//
//main()
//{
//department d1;
//d1.set_dep()	
//	
//}



//#include<iostream>
//#include<fstream>
//using namespace std;
//class student
//{
//    private:
//        int rollno;
//        string name,gender;
//
//     public:
//           void set_student(int rollno,string name,string gender)
//           {
//               cout<<"\nset of student called";
//               this->rollno=rollno;
//               this->name=name;
//               this->gender=gender;
//           }
//           
//           void display()
//           {
//               cout<<"\n hi i am "<<rollno<<" and my name is "<<name;
//               cout<<"\ndisplay of student";
//           }
//};
//class department
//{
////    private:
//       
//    public:
//        student s;
//        void set_dept(int rollno,string name,string gender)
//        {
//            cout<<"\nset of dept called";
//            s.set_student(rollno,name,gender);
//           
//        }
//        void display()
//        {
//            s.display();
//            cout<<"\ndisplay of dept";
//        }
//};
//
//
//int main()
//{
//  department d;
//  d.set_dept(1,"abcd","m");
//  d.display();
//  d.s.set_student(2,"xyz","f");
//  d.s.display();
// 
//}
//
//12. Operator Overloading: - Question: Overload the + operator for a custom class
//ComplexNumber to perform addition of complex numbers. - Logic: Define the
//__add__ special method in the class to customize the behavior of the + operator. -
//Sample Input: result = complex1 + complex2 - Expected Output: A ComplexNumber
//object representing the sum of two complex numbers.


#include<iostream>
using namespace std;

class  cmplex

{
    private:
    	
    	int real;
    	double imaginary;
    	char img=i;
    	public:
    		
    		void set_data(int real, double imaginary)
    		{
    			this->real=real;
    			
    			this->imaginary=imaginary;
			}
			
			void get_data()
			{
				cout<<"\n Real Number "<<real<<"\n Imaginary Number"<<imaginary;
				cout<<
				
			}

};

main()
{
}