using System;

namespace FizzBuzz
{
    class Program
    {
        static void Main(string[] args)
        {
            string input;
            long count, divOne, diveTwo;

            while ((input = Console.ReadLine()) != null)
            {
                string[] split = input.Split(new char[] {' '}, StringSplitOptions.None);
                divOne = Int64.Parse(split[0]);
                diveTwo = Int64.Parse(split[1]);
                count = Int64.Parse(split[2]);

                

                for (int i = 1; i <= count; i++)
                {
                    
                    if (i % divOne == 0 && i % diveTwo == 0) Console.WriteLine("FizzBuzz");
                    else if (i % divOne == 0) Console.WriteLine("Fizz");
                    else if (i % diveTwo == 0) Console.WriteLine("Buzz");
                    else Console.WriteLine(i);
                }
            }
            
        }
    }
}
