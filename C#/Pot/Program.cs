using System.IO;
using System;
using System.Collections.Generic;

namespace Pot
{
    class Program
    {
         static List<double> list = new List<double>();
         static int count, nrOfTimes = 0;

         static double sum;

        static void Main(string[] args)
        {
           
            
           
            string line;
            while((line = Console.ReadLine()) != null)
            {
                String[] split = line.Split(new char[] { ' ' }, StringSplitOptions.None);
                //list.Add(split[0]);
                Start(split);
                nrOfTimes++; 
               
            }
            

           
        }

        static void Start(String[] split)
        {
            double nr, power;
            double q;

            if (nrOfTimes != 0)
            {
                nr = Convert.ToDouble(split[0].Remove(split[0].Length - 1));
                power = Convert.ToDouble(split[0].Substring(split[0].Length - 1));
                q = Math.Pow(nr, power);
                list.Add(q);
            }
            else
            {
                count = Int32.Parse(split[0]);
                return;
            }
            
            if (count == nrOfTimes)
            {
                foreach (var item in list)
                {
                    sum += item;
                   
                }
                Console.WriteLine(sum);
            }
            

}}}
