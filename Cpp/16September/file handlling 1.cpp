//#include<iostream>
//#include<fstream>
//using namespace std;
//
//
//
//main()
//{
//	
//	ofstream MyFile("XYZ.txt");
//	
//	MyFile<<"\nHi how are you";
//		MyFile<<"\nhow things are going on";
//	
//	
//	MyFile.close();
//	cout<<"File created"; 
//}


//
//#include<iostream>
//#include<fstream>
//
//using namespace std;
//
//
//main()
//{
//	
//	ifstream file("XYZ.txt");
//	
//    string word;
//    
//    while(file>>word)
//    {
//    	
//    	cout<<"\n "<<word;
//	}
//	
// file.close();
//}
//
#include<iostream>
#include<fstream>
using namespace std;


main()
{
	string name, native;
	
	cout<<"\n Enter the name";
	cin>>name;
	ofstream file(""+name+".txt");
	cout<<"\nhi"<<name<<"where are you from:"<<endl;
	
	cout<<"\n Enter the native place";
	cin>>native;
	
	file<<"\n hi"<<name<<"so you are from"<<native<<endl;
	
	file.close();
	cout<<"\n File created successfully";
}


//
//
//#include<iostream>
//#include<fstream>
//using namespace std;
//int main()
//{
//  string name,native;
//   cout<<"Enter name:";
//   cin>>name;
//  ofstream out(""+name+".txt");
//  cout<<"\nso "<<name<<"where are you from ?\n";
//  cin>>native;
//  out<<"Name is "<<name<<" and native is "<<native;
//  out.close();
//  cout<<"\nWritten to file and saved..";
//}