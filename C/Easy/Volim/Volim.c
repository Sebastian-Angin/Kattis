#include <stdio.h>
// PS C:\Users\zeb_a\Documents\Kattis\C\Easy\Volim> cd "c:\Users\zeb_a\Documents\Kattis\C\Easy\Volim\" ; if ($?) { gcc Volim.c ReadLocalData.c TimeAndAnwser.c -o Volim } ; if ($?) { .\Volim }
char getData();
void start();
void loadData();

char inputText[100];
int anwserCount = 0;


int main()
{
    while (anwserCount < 3)
    {
        start();
    }
    return 0;
}

void start()
{
    
    loadData();
    
}

void loadData()
{
    inputText = getData();

    printf("%s", inputText);
}