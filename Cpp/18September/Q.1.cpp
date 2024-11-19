/*Employee Management System
File handling has been effectively used for each feature of this project
Operation
1. Add Employee Information
1. Search Employee Information
1. Delete Employee Data
2. Search Employee Record.*/

#include<iostream>
#include<fstream>
using namespace std;
main()
{
string name,line;
int emp_id,ch;
ofstream file("Employee.txt");
cout<<"Enter employee name: ";
cin>>name;
cout<<"Enter employe id: ";
cin>>emp_id;
cout<<"\n Records added: ";
file<<"Employee Name: "<<name;
file<<"\nEmployee id: "<<emp_id;
file.close();
cout<<"List of records:";
ifstream in("Employee.txt");
while(getline(in,line))
{
cout<<"\n"<<line;
}
in.close();
in.open("Employee.txt");
cout<<"\nEnter employee name you want to search for: ";
cin>>name;
while(getline(in,line))
{
if(line==name)
 cout<<"\n"<<line;
else
 cout<<"\n Not found";
if(line==name)
}
in.close();
}