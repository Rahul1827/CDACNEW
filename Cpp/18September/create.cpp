////#include<iostream>
////#include<fstream>
////using namespace std;
////
////void Createfile(string fname)
////{
////	ofstream file(fname+".txt");
////	
////	file<<"hi Rahul";
////	
////file.close();
////cout<<"\n File created:";
////	
////}
////
////
////main()
////{
////  string filename;
////  cout<<"\n enter the file name:";
////  cin>>filename;
////  
////   Createfile(filename);
////  	
////	
////}
////
////
//
////
////
////#include<iostream>
////#include<fstream>
////
////using namespace std;
////
//// void ReadFile()
//// {
//// 	string line;
//// 	ifstream file ("Rahul.txt");
//// 	
//// 	while(getline(file,line))
//// 	{
//// 		cout<<line;
////	 }
//// 	
//// 	
//// }
////
////main()
////
////{
////
////	ReadFile();
////	
////}
//
//
////#include<iostream>
////#include<fstream>
////using namespace std;
////
////main()
////{
////	string line;
////	
////	ifstream file("Rahul.txt");
////	while(getline(file, line)){
////		
////		cout<<line;
////	}
////	
////	
////	
////}
//
//
//#include<iostream>
//
//using namespace std;
//
//class Person
//{
//  private:
//  	string name;
//  	int age;
//  	
//  	public:
//  		void GetDetails(string na, int ag)
//  		{
//  			name=na;
//  			age=ag;
//  			
//		  }
//		  
//		  void show()
//		  
//		  {
//		  	cout<<"\n Hi"<<name<<" how are you "<<name<<"how old are you"<< age<<endl;
//		  }
//};
//
//
//
//main()
//{
//	string name;
//	int age;
//	
//	cout<<"\n Enter the name:";
//	cin>>name;
//	
//		cout<<"\n Enter the age:";
//	cin>>age;
//	
//	Person p1;
//	p1.GetDetails(name,age);
//	p1.show();
//	
//	
//	
//	
//	
//}



//#include<iostream>
//#include<fstream>
//using namespace std;
//
//void Createfile(string fname)
//{
//	ofstream file(fname+".txt");
//	
//	file<<"hi Rahul";
//	
//file.close();
//cout<<"\n File created:";
//	
//}
//
//
//main()
//{
//  string filename;
//  cout<<"\n enter the file name:";
//  cin>>filename;
//  
//   Createfile(filename);
//  	
//	
//}
//
//

//
//
//#include<iostream>
//#include<fstream>
//
//using namespace std;
//
// void ReadFile()
// {
// 	string line;
// 	ifstream file ("Rahul.txt");
// 	
// 	while(getline(file,line))
// 	{
// 		cout<<line;
//	 }
// 	
// 	
// }
//
//main()
//
//{
//
//	ReadFile();
//	
//}


//#include<iostream>
//#include<fstream>
//using namespace std;
//
//main()
//{
//	string line;
//	
//	ifstream file("Rahul.txt");
//	while(getline(file, line)){
//		
//		cout<<line;
//	}
//	
//	
//	
//}


//#include<iostream>
//
//using namespace std;
//
//class Person
//{
//  private:
//  	string name;
//  	//int age;
//  	
//  	public:
//  		void GetDetails(string na)
//  		{
//  			name=na;
//  			//age=ag;
//  			
//		  }
//		  
//		  void show()
//		  
//		  {
//		  	cout<<"\n Hi "<<name<<" how are you "<<endl;
//		  }
//};
//
//
//
//main()
//{
//	string name;
//	int age;
//	
//	cout<<"\n Enter the name:";
//	cin>>name;
////	
////		cout<<"\n Enter the age:";
////	cin>>age;
//	
//	Person p1;
//	p1.GetDetails(name);
//	p1.show();
//	
//	
//	
//	
//	
//}

#include<iostream>
using namespace std;
 
 class person
 {
 	private:
 		string name;
 		int student_id;
 		
 	public:
 		
 		public:
 			void GetDetails(string na)
 			{
 				
 				name=na;
			 }
 			
 	
 };
 
 class student: public person
 {
 	
 	private:
 		int st_id;
 		public:
 			
 			void SetDetails(string na,int student_id)
 			{
 			
 				this.student_id=student_id;
			 }
			 
			 void ShowDetails()
			 {
			 	cout<<"hi"<<name<<"your student id is "<<student_id
			 	
			 }
 	
 };


main()
{
	Student s1;
	s1.SetDetails();
	s1.
	
	
	
}