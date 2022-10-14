#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
    long long eyes, nose, mouths;
    while (cin >> eyes >> nose >> mouths)
    {
        long result = eyes * nose * mouths;

        cout << result << endl;
    }
    
    return 0;
}
