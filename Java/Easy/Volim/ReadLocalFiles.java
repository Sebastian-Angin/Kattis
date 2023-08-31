import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadLocalFiles
{
    String input;
    List<String> dataList = new ArrayList<String>();
    int index = 1;
    String folder = Paths.get(System.getProperty("user.dir")).getFileName().toString();
    File inputFile;

    void setInputFile ()
    {
        inputFile = new File(String.format("C:/Users/zeb_a/Documents/Kattis/Java/Easy/%s/data/%d.in",folder, index));
    }


    public List<String> getData(int index)
    {
        dataList.clear();
        this.index = index;
        setInputFile();
        
        try(BufferedReader br = new BufferedReader(new FileReader(inputFile)))
        {
            String line = br.readLine();

            while(line != null)
            {
                dataList.add(line);
                line = br.readLine();
            }
            
        }
        catch (Exception e)
        {
            System.out.println("Something wrong " + e.toString());
        }

        return dataList;
        
    }
}
