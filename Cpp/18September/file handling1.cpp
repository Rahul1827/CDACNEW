//#include<iostream>
//#include<fstream>
//
//using namespace std;
// void  count()
// {
// 	int lines=0, words=0, alphabets=0, numeric=0, capital=0, small=0, symbols=0;
// 	char c;
// 	
// 	ifstream file("Patilok.txt");
// 	while(file.get(c))
// 	{
// 		if(c=='\n')
// 		{
// 			lines++;
// 			words++;
// 			
//		 }
//		 
//		 if(c==' ')
//		 {
//		 	words++;
//		 }
//		 
//		 if(c>='a' && c<='z' || c>='A' && c<='Z' )
//		 {
//		    alphabets++;	
//		 }
// 		
// 		if(c>='0' && c<='9')
// 		{
// 			numeric++;
//		 }
// 		if(c>='A' && c<='Z')
// 		{
// 			
// 			capital++;
//		 }
// 		
// 		if(c>='a' && c<='z' )
// 		{
// 			small++;
//		 }
//		 
//		 if(!((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')|| isspace(c)))
//		 
//		 {
//		 	symbols++;
//		 }
//	 }
//	 if(!isspace(c))
//	 {
//	 	words++;
//	 }
// 	
// 	
// 	cout<<"\n Number of lines: " <<lines<<endl;
// 	cout<<"\n Number of words: " <<words<<endl;
// 	cout<<"\n Number of alphabets: " <<alphabets<<endl;
// 	cout<<"\n Number of numeric: " <<numeric<<endl;
// 	cout<<"\n Number of capital: " <<capital<<endl;
// 	cout<<"\n Number of small: " <<small<<endl;
// 	cout<<"\n Number of symbols: " <<symbols<<endl;
// 	
// 	
// 	file.close();
// 	cout<<"\n Read suceesfully";
// 	
// 	
// 	
// }
//
//main()
//{
//	
//	
//	count();
//	
//}

#include <iostream>
#include <fstream>

using namespace std;

void count() {
    int lines = 0, words = 0, alphabets = 0, numeric = 0, capital = 0, small = 0, symbols = 0;
    char c;

    ifstream file("Patilok.txt");
    
    if (!file) {
        cerr << "Error opening file." << endl;
        return;
    }

    bool inWord = false; // Flag to track if we are inside a word

    while (file.get(c)) {
        if (c == '\n') {
            lines++;
            if (inWord) {
                words++; // Count the last word in the line
                inWord = false; // Reset the flag
            }
        }

        if (c == ' ') {
            if (inWord) {
                words++; // Count the last word before the space
                inWord = false; // Reset the flag
            }
        }

        if (isalpha(c)) {
            alphabets++;
            if (isupper(c)) {
                capital++;
            } else {
                small++;
            }
            inWord = true; // Set flag when we are in a word
        }

        if (isdigit(c)) {
            numeric++;
        }

        if (!isalnum(c) && !isspace(c)) {
            symbols++;
        }
    }

    // Check for the last line or word if it doesn't end with a newline
    if (inWord) {
        words++;
    }
    if (lines > 0 || inWord) { // Increment lines if there are words
        lines++;
    }

    // Output the results
    cout << "\nNumber of lines: " << lines << endl;
    cout << "Number of words: " << words << endl;
    cout << "Number of alphabets: " << alphabets << endl;
    cout << "Number of numeric: " << numeric << endl;
    cout << "Number of capital: " << capital << endl;
    cout << "Number of small: " << small << endl;
    cout << "Number of symbols: " << symbols << endl;

    file.close();
    cout << "\nRead successfully." << endl;
}

int main() {
    count();
    return 0;
}
