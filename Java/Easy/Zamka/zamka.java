import java.util.Scanner;

public class zamka
{
    public static void main(String[] args) throws Exception
    {
        long lowNumber, highNumber, compNumber;

        Scanner sc = new Scanner(System.in);

        lowNumber = sc.nextLong();
        highNumber = sc.nextLong();
        compNumber = sc.nextLong();

        System.out.println(loopThroughNumbersLow(lowNumber, highNumber, compNumber));
        System.out.println(loopThroughNumbersHigh(lowNumber, highNumber, compNumber));
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