#include <iostream>
using namespace std;

long long calcNumber(long long number);
long long loopLowToHigh (long long low, long long high, long long comp);
long long loopHighToLow (long long low, long long high, long long comp);


int main()
{

    long long lowNumber, highNumber, compNumber;
    cin >> lowNumber >> highNumber >> compNumber;
    //cin >> lowNumber;
    //cin >> highNumber;
    //cin >> compNumber;

    cout << loopLowToHigh(lowNumber, highNumber, compNumber) << endl;
    cout << loopHighToLow(lowNumber, highNumber, compNumber) << endl;

    return 0;
}

long long loopLowToHigh (long long low, long long high, long long comp)
{
    for (long i = low; i <= high; i++)
    {
        long long answer = calcNumber(i);
        if(comp == answer) return i;
    }
    return 0;
}

long long loopHighToLow (long long low, long long high, long long comp)
{
    for ( long i = high; i >= low; i--)
    {
        
        long long answer = calcNumber(i);
        if(comp == answer) return i;
    }
    return 0;
}

long long calcNumber(long long number)
{
    long long sumOfNumber = 0;

    while (number != 0)
    {
        sumOfNumber += number % 10;
        number /= 10;
    }

    return sumOfNumber;
    
}