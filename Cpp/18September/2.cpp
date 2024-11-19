//#include<iostream>
//#include<fstream>
//
//using namespace std;
//
////main()
////{
////	
////	ofstream file("Patil.txt",ios::app);
////	string ok;
////	
////	file<<"hi rahul hdkjn,dswkchdwslkjnkjnhnikhknknkhdsk deskn cdj dsjhkj";
////	file<<"ndckj dcbn,m dcs bncledsjmcl;jcolwscx,sncxolasjclqjdlqwdjnmqwlnmdoq2ue0:";
////	while(true){
////		getline(cin,ok);
////		file<<ok;
////		if(ok=="ok"){
////			break;
////		}
////	}
////	file.close();
////	cout<<"\n sucess";
////}
//main()
//{
//	
//	ofstream file("Patilok.txt",ios::app);
//	string ok;
//	
//	
//	while(true){
//		getline(cin,ok);
//		
//		if(ok=="ok"){
//			break;
//		}
//		file<<ok;
//	}
//	file.close();
//	cout<<"\n sucess";
//}

#include<iostream>
#include<fstream>

using namespace std;
 void  count()
 {
 	int lines=0, words=0, alphabets=0, numeric=0, capital=0, small=0, symbols=0;
 	char c;
 	
 	ifstream file("Patilok.txt");
 	while(file.get(c))
 	{
 	
		 
		 if(c==' ')
		 {
		 	words++;
		 }
		 
		 if(c>='a' && c<='z' || c>='A' && c<='Z' )
		 {
		    alphabets++;	
		 }
 			if(c=='\n')
 		{
 			lines++;
 			words++;
 			
		 }
 		if(c>='0' && c<='9')
 		{
 			numeric++;
		 }
 		if(c>='A' && c<='Z')
 		{
 			
 			capital++;
		 }
 		
 		if(c>='a' && c<='z' )
 		{
 			small++;
		 }
		 
		 if(!((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')|| isspace(c)))
		 
		 {
		 	symbols++;
		 }
	 }
	 if(!isspace(c))
	 {
	 	words++;
	 }
	 
 	
 	
 	cout<<"\n Number of lines: " <<lines<<endl;
 	cout<<"\n Number of words: " <<words<<endl;
 	cout<<"\n Number of alphabets: " <<alphabets<<endl;
 	cout<<"\n Number of numeric: " <<numeric<<endl;
 	cout<<"\n Number of capital: " <<capital<<endl;
 	cout<<"\n Number of small: " <<small<<endl;
 	cout<<"\n Number of symbols: " <<symbols<<endl;
 	
 	
 	file.close();
 	cout<<"\n Read suceesfully";
 	
 	
 	
 }

main()
{
	
	
	count();
	
}