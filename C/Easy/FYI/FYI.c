#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
    /*
    In the United States of America, telephone numbers within an area code consist of seven digits:
    the prefix number is the first three digits and the line number is the last four digits.
    Traditionally, the  prefix number has been used to provide directory information and assistance as in the following examples:
        555-1212
        555-9876
        555-5000
        555-7777
    Telephone company switching hardware would detect the  prefix and route the call to a directory information operator.
    Nowadays, telephone switching is done digitally and somewhere along the line a computer decides where to route calls.
    For this problem, write a program that determines if a supplied seven-digit telephone number should be routed to the directory information operator,
    that is, the prefix number is .
    */


    /* //For reading files
    FILE *textfile;
    char *text;
    long numbytes;
    
    
    //Open the text file in read mode, using fopen(). If file pointer is null, return 1, else continue
    textfile =fopen("C:/Users/zeb_a/Documents/Kattis/C/Easy/FYI/fyi/a001.in", "r");
    if(textfile == NULL)
        return 1;
    //Get the length of text file using fseek() and ftell() functions
    fseek(textfile, 0L, SEEK_END);
    numbytes = ftell(textfile);
    fseek(textfile, 0L, SEEK_SET);

    // Create a string, (character array) and allocate memory using the length of text file. If memory is not successful, return 1, else continue.
    text =(char*)calloc(numbytes, sizeof(char));
    if(text == NULL)
        return 1;

    //Read contents of text file into the string using fread() function.
    fread(text, sizeof(char), numbytes, textfile);
    //Close the text file using fclose() function.
    fclose(textfile);
    */

    // Result is for the comparison of strings, firstThree is for spliting string and putting the first three in a variable,
    // inputText is to save the input from Kattis.
    int result;
    char firstThree[4];
    char inputText[50];

    //Using while loop to read input from Kattis. Saving it in inputText.
    while (scanf("%s", inputText) == 1)
    {
        // Looping through the input and saving the first three char in a variable
        for(int i = 0; i<3; ++i)
        {
            firstThree[i] = inputText[i];
        }
    // comparing the firt three with 555 to see if it is the right prefix. 
    result = strcmp(firstThree, "555");
    // Checking the result, if it is equal we print 1 and if not we print 0.
    if(result == 0)
        printf("1\n");
    else
        printf("0\n");
    }
    

}