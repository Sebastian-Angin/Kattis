using System;

namespace Jack_O__Lantern_Juxtaposition
{
    class Program
    {
        static void Main(string[] args)
        {
            string line;
            long eyes, nose, mouths;
            while((line = Console.ReadLine()) != null)
            {
                string[] split = line.Split(new char[] {' '}, StringSplitOptions.None);
                eyes = Int64.Parse(split[0]);
                nose = Int64.Parse(split[1]);
                mouths = Int64.Parse(split[2]);

                long result = eyes * nose * mouths;


                Console.WriteLine(result);
            }
        }
    }
}
