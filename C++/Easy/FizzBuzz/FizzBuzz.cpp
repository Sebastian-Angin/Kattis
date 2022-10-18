#include <iostream>
using namespace std;
int main(){
    long long divOne, divTwo, range;

    while (cin >> divOne >> divTwo >> range) {
        
        for (int i = 1; i <= range; i++)
        {

            if(i%divOne == 0 && i%divTwo == 0) cout << "FizzBuzz" << endl;
            else if(i%divOne == 0) cout << "Fizz" << endl;
            else if(i%divTwo == 0) cout << "Buzz" << endl;
            else cout << i << endl;
        }
        
    }

    return 0;
}