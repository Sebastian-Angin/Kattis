Create a file with .cpp

Run file with Coderunner

need to have:
#include <iostream>
using namespace std;
int main() {return 0;}

Read txt file:

ifstream inFile;
    string input;
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

inFile.close();

Kattis:
while (cin >> input) {cout << output << endl}