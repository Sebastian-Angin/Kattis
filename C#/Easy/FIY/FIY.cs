using System;
using System.IO;

namespace FIY
{
    class Program
    {
        static void Main(string[] args)
        {
            string line;

            string input = "No input";
            string output = "0";

            // input file for the example output
            string inputFile = @"C:\Users\zeb_a\Documents\Kattis\C#\Easy\FIY\fyi\a002.in";
            /* // Reading the file using Stream.
            if(File.Exists(inputFile))
            {
                using(StreamReader file = new StreamReader(inputFile))
                input = file.ReadToEnd();
                Console.WriteLine(input);
            }
            */

            // Another Way to Read the file.
            //input = File.ReadAllText(inputFile);
            
            // This while loop is used to read the input from Kattis
            while ((line = Console.ReadLine()) != null)
            {
                // string[] split = input.Split(new char[] {' '}, StringSplitOptions.None);
                input = line;

                // Separating the three first numbers as that is the only thing we need.
                string firstThree = input.Substring(0, 3);
                
                // Checking to see if it is 555 or something else and assign the output.
                if(firstThree == "555")
                {
                    output = "1";
                }
                else
                {
                    output = "0";
                }

                //output = input;  
                Console.WriteLine(output);
            }
            



            

            
            
        }
    }
}
