package input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class ReadLocalFiles
{
    String fileLocation = "input/sample.in";
    String line;

    List<String> inputData = new ArrayList<String>();

    public List<String> getInputData()
    {
        System.out.println("Starting to read file from " + fileLocation);

        try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation)))
        {
            
            while ((line = reader.readLine()) != null)
            {
                inputData.add(line);
            }
        } catch (Exception e)
        {
            System.out.println("Something went wrong with reading the input data: " + e);
        }
        return inputData;
    }    
}
