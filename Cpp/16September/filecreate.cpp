////#include <iostream>
////#include<fstream>
////using namespace std;
////
////main()
////{
////	ofstream Myfile("Source.txt");
////	
////	Myfile<<" Bharat, a land of diversity, where ancient traditions meet modern aspirations.28 states, 8 union territories, united by a common spirit.From the snow-capped Himalayas to the sun-kissed beaches of Goa, India offers a kaleidoscope of experiences.1.3 billion dreams, one nation, many languages, one culture.Jai Hind! India, the land of opportunity and the cradle of civilization.";
////	
////	cout<<"\n File created";
////	
////	Myfile.close();
////	
////}
//
//
//#include <iostream>
//#include <fstream>
////#include <cctype> 
//#include <string>
//
//using namespace std;
//
//int main() {
//    string line;
//    ifstream input("source.txt");
//
//    if (!input) {
//        cerr << "Error opening file!" << endl;
//        return 1;
//    }
//
//    int lineCount = 0;
//    int wordCount = 0;
//    int alphabetCount = 0;
//    int digitCount = 0;
//    int symbolCount = 0;
//
//    while (getline(input, line)) {
//        lineCount++;
//
//        
//        bool inWord = false;
//        for (char ch : line) {
//            if (isalpha(ch)) {
//                alphabetCount++;
//                if (!inWord) {
//                    wordCount++;
//                    inWord = true;
//                }
//            } else if (isdigit(ch)) {
//                digitCount++;
//                if (!inWord) {
//                    wordCount++;
//                    inWord = true;
//                }
//            } else if (isspace(ch)) {
//                inWord = false;
//            } else {
//                symbolCount++;
//                if (!inWord) {
//                    wordCount++;
//                    inWord = true;
//                }
//            }
//        }
//    }
//
//    input.close();
//
//    cout << "Number of lines: " << lineCount << endl;
//    cout << "Number of words: " << wordCount << endl;
//    cout << "Number of alphabets: "<< alphabetCount << endl;
//    cout << "Number of digits: " << digitCount << endl;
//    cout << "Number of symbols: " << symbolCount << endl;
//
//    return 0;
//}



//ask user name ,name.txt keep adding data till quit

#include<iostream>
#include<fstream>

using namespace std;

main()
{
	
	ofstream.outputFile("Source.txt",ios::app);
	
	if(outputFile.is_open())
	
	{
		outputFile<<"Appended text !"<<endl;
		outputFile.close();
		
		cout<<"Text"
		
	}
	
	
}
