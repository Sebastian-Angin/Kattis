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

            /*
            string inputFile = @"C:\Users\zeb_a\Documents\Kattis\C#\Easy\FIY\fyi\a002.in";

            input = File.ReadAllText(inputFile);
            */

            while ((line = Console.ReadLine()) != null)
            {
                // string[] split = input.Split(new char[] {' '}, StringSplitOptions.None);
                input = line;
                string firstThree = input.Substring(0, 3);
                

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
