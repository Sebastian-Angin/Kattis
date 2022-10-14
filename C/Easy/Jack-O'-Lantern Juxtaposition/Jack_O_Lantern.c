#include <stdio.h>

int main()
{
    long long eyes, nose, mouths;
    while (scanf("%lld%lld%lld", &eyes, &nose, &mouths) == 3)
    {
        int result = eyes * nose * mouths;
        printf("%lld\n", result);

    }
}