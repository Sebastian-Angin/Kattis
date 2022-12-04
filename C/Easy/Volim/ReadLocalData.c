#include<stdio.h>
#include<stdlib.h>
#include<string.h>

FILE *textfile;
char *text;
long numbytes;
char inputFile[] = "C:/Users/zeb_a/Documents/Kattis/C/Easy/Volim/data/volim.1.in"; //1 is char 50


char* getData()
{
    //Open the text file in read mode, using fopen(). If file pointer is null, return 1, else continue
    textfile =fopen(inputFile, "r");
    if(textfile == NULL)
        printf("Textfile Null");
    //Get the length of text file using fseek() and ftell() functions
    fseek(textfile, 0L, SEEK_END);
    numbytes = ftell(textfile);
    fseek(textfile, 0L, SEEK_SET);

    // Create a string, (character array) and allocate memory using the length of text file. If memory is not successful, return 1, else continue.
    text =(char*)calloc(numbytes, sizeof(char));
    if(text == NULL)
        printf("Text Null");

    //Read contents of text file into the string using fread() function.
    fread(text, sizeof(char), numbytes, textfile);
    //Close the text file using fclose() function.
    fclose(textfile);

    return text;
}