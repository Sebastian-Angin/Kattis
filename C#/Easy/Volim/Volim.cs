using System;
using System.IO;
using System.Collections.Generic;

namespace Volim
{
    public class Volim
    {
        List<string> inputData = new List<string>();
        //ReadLocalFile readFiles = new ReadLocalFile();

        int count = 1;
        int questions = 0;
        int testIndex = 1;
            
        int players =  0;
        int numberOfQuestions = 0;
        int timeCalc = 0;
        List<TimeAndAwser> timeAndAnwser = new List<TimeAndAwser>();

        static void Main(string[] args)
        {
            Volim start = new Volim();
            start.Start();
        }

        void Start ()
        {
            /*
            while (testIndex <= 3)
            {
                
                inputData.Clear();
                inputData = readFiles.getInputDataList(testIndex);
                foreach (var line in inputData)
                {
                    switch (count)
                    {
                        case 0:
                            players = Int32.Parse(line);
                            count++;
                            break;
                        case 1:
                            numberOfQuestions = Int32.Parse(line);
                            count++;
                            break;
                        default:
                            string[] split = line.Split(new char[] {' '}, StringSplitOptions.None);
                            timeAndAnwser.Add(new TimeAndAwser(split[0], split[1]));
                            questions++;
                            count++;
                            break;
                    }
                }
                */

                players = Int32.Parse(Console.ReadLine());
                numberOfQuestions = Int32.Parse(Console.ReadLine());

                string input;

                while ((input = Console.ReadLine()) != null && count != numberOfQuestions) 
                {
                    string[] split = input.Split(new char[] {' '}, StringSplitOptions.None);
                    timeAndAnwser.Add(new TimeAndAwser(split[0], split[1]));
                    count++;
                }

                foreach (var item in timeAndAnwser)
                {
                    //Console.WriteLine("ho");
                    timeCalc += item.Time;
                    if (timeCalc >= 210) break;
                    if (item.Anwser == "T")
                    {
                        //Console.WriteLine("hi");
                        if (players != 8) players++;
                        else players = 1;         
                    }
                }

                Console.WriteLine(players);
                //Console.WriteLine(readFiles.getAnwser());
                /*

                if (Int32.Parse(readFiles.getAnwser()) == players)
                {
                    Console.WriteLine("Correct");
                }
                else
                {
                    Console.WriteLine("Not Correct");
                }
                */
                count = 0;
                timeAndAnwser.Clear();
                timeCalc = 0;
                testIndex++; 
            //}
            

           

        }
    }
}


/*


           foreach (string line in File.ReadLines(dataInputFile))
           {
                switch (count)
                {
                    case 0:
                        person = Int32.Parse(line);
                        count++;
                        break;
                    case 1:
                        numberOfQuestions = Int32.Parse(line);
                        count++;
                        break;
                    default:
                        string[] split = line.Split(new char[] {' '}, StringSplitOptions.None);
                        timeAndAnwser.Add(new TimeAndAwser(split[0], split[1]));
                        questions++;
                        count++;
                        break;
                }
           }

            foreach (var item in timeAndAnwser)
            {
                timeCalc += item.Time;
                Console.WriteLine("Test" + timeCalc);
                if (timeCalc >= 210) break;
                if (item.Anwser == "T")
                {
                    if (person != 8) person++;
                    else person = 1;         
                }
            } 

           Console.WriteLine(person);
*/