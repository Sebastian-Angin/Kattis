using System;
using System.IO;
using System.Collections.Generic;


namespace Volim
{
    public class ReadLocalFile
    {

        string dataInputFile = "";
        string anwserInputFile = "";

        List<string> inputData = new List<string>();
        List<string> anwserData = new List<string>();

        string namespaceName;

        int dataFileNumber = 1;

        public ReadLocalFile()
        {
            namespaceName = GetType().Namespace;

            updateFileString();
        }

        void updateFileString() 
        {
            dataInputFile = $@"C:\Users\zeb_a\Documents\Kattis\C#\Easy\{namespaceName}\data\volim.{dataFileNumber}.in";
            anwserInputFile = $@"C:\Users\zeb_a\Documents\Kattis\C#\Easy\{namespaceName}\data\volim.{dataFileNumber}.ans";
        }


        public List<string> getInputDataList(int index)
        {
            dataFileNumber = index;
            updateFileString();
            getAnwserDataList();
            inputData.Clear();
            foreach (string line in File.ReadLines(dataInputFile))
            {
                inputData.Add(line);
            }
            return inputData;
        }

        public List<string> getAnwserDataList()
        {
            anwserData.Clear();
            foreach (string line in File.ReadLines(anwserInputFile))
            {
                anwserData.Add(line);
                
            }
            return anwserData;
        }

        public string getAnwser()
        {
            string anwser = "Unknown";

            anwser = anwserData[0];

            return anwser;
        }

        
    }


}