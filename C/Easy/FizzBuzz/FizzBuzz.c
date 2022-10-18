#include <stdio.h>
int main()
{
    long long divOne, divTwo, range;
   
    while (scanf("%lld%lld%lld", &divOne, &divTwo, &range) == 3)
    {
        for (int i = 1; i <= range; i++)
        {
            if (i%divOne == 0 && i%divTwo == 0) printf("FizzBuzz\n");
            else if (i%divOne == 0) printf("Fizz\n");
            else if (i%divTwo == 0) printf("Buzz\n");
            else printf("%d\n", i);         
        }      
    }
}