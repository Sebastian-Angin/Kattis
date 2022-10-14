#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main(int argc, char const *argv[])
{
    string input;

    /*
    ifstream inFile;
    
    inFile.open("C:/Users/zeb_a/Documents/Kattis/C++/Easy/FYI/fyi/a002.in", ios::in);

    if(!inFile){
        cout << "Unable to open file";
        exit(1);
    }
    string i;
    while(getline(inFile, i)){
        input += i;
        //cout << input;
    }
*/

while (cin >> input)
{
   string firstThree = input.substr(0,3);


    int result = firstThree.compare("555");

    if(result == 0) cout << "1" << endl;
    else cout << "0" << endl;
}

    


    //inFile.close();
    
    return 0;
}

