using System;

namespace Zamka
{
    class Program
    {
        static void Main(string[] args)
        {
            long lowestNumber, highestNumber, compareSum;

            lowestNumber = Int64.Parse(Console.ReadLine());
            highestNumber = Int64.Parse(Console.ReadLine());
            compareSum = Int64.Parse(Console.ReadLine());
            Console.WriteLine(loopThroughNumbersLow(lowestNumber, highestNumber, compareSum));
            Console.WriteLine(loopThroughNumbersHigh(lowestNumber, highestNumber, compareSum));
            
        }

        static long loopThroughNumbersHigh(long low, long high, long comp)
        {
            for (long i = high; i >= low; i--)
            {
                long answer = CalcSumOfNumber(i);
                if(comp == answer) return i;
            }
            return 10003;
        }

        static long loopThroughNumbersLow(long low, long high, long comp)
        {
            for (long i = low; i <= high; i++)
            {
                long answer = CalcSumOfNumber(i);
                if(comp == answer) return i;
            }
            return 10002;
        }

        static long CalcSumOfNumber(long number)
        {
            long sumNumber = 0;
            while(number != 0)
            {
                sumNumber += number % 10;
                number /= 10;
            }

            return sumNumber;
        }
    }
}
