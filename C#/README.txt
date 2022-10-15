To create a new project use: dotnet new consol

To run program use: dotnet run

string inputFile = @"C:\Users\zeb_a\Documents\Kattis\C#\Easy\FIY\fyi\a002.in";

To read files from Kattis:
string line;
while ((line = Console.ReadLine()) != null)
            {put the entire code here}

Console.WriteLine(output);

To read text from files:

string inputFile = @"Path to file";

input = File.ReadAllText(inputFile);

Using stream to read file:

if(File.Exists(inputFile))
            {
                using(StreamReader file = new StreamReader(inputFile))
                input = file.ReadToEnd();
                Console.WriteLine(input);
            }