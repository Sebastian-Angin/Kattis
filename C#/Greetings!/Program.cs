using System;
using System.Text;


namespace Greetings_
{
    class Program
    {
        static void Main(string[] args)
        {
            string line;
             while((line = Console.ReadLine()) != null)
            {
                String[] split = line.Split(new char[] { ' ' }, StringSplitOptions.None);
                Start(split);
               
            }
        }

        static void Start(String[] split)
        {
            for (var i = 0; i < split.Length; i++)
            {
                var builder = new StringBuilder();
                foreach (char item in split[i])
                {
                    builder.Append(item);
                    if (item.Equals('e'))
                    {
                        builder.Append("e");
                    }
                  
                }
                String txt = split[i];
                txt = builder.ToString();
                Console.WriteLine(txt);
            }
            
        }
    }
}
