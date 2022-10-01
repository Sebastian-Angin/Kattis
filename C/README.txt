Create a new file with .c extension.

Right click and press run program.

Need to have:

int main(){}

To read files use this:

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


For Kattis use this:
%s is for string, %d int. Increse 1 depending on how many inputs there are.
while (scanf("%s", inputText) == 1){}
