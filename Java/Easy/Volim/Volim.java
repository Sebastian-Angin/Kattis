import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Volim
{
    
    //ReadLocalFiles readData = new ReadLocalFiles();
    List<String> inputDataList = new ArrayList<>();
    List<TimeAndAnwser> timeAndAwserList = new ArrayList<>();

    int testIndex = 1;
    int count = 2;

    int labels = 0;
    int questionsAsked = 0;
    int time = 0;
    int timeLimit = 210;
    public static void main(String[] args) throws Exception
    {
        Volim vol = new Volim();
        vol.Start();
    }

    void Start()
    {
        // Kattis
        Kattis();
        // Test
        //Test();
        
    }
/*
    void Test()
    {
        while (testIndex <= 3)
        {
            inputDataList = readData.getData(testIndex);

            labels = Integer.parseInt(inputDataList.get(0));
            questionsAsked = Integer.parseInt(inputDataList.get(1));
            

            while (count <= questionsAsked + 1)
            {
                String line = inputDataList.get(count);
                String[] str = line.split(" ");
                timeAndAwserList.add(new TimeAndAnwser(Integer.parseInt(str[0]), str[1]));
                count++;
            }

            Solution();

            Reset();
            testIndex++;
        }
    }
*/
    void Kattis()
    {
        Scanner sc = new Scanner(System.in);

        labels = Integer.parseInt(sc.nextLine());
        questionsAsked = Integer.parseInt(sc.nextLine());
       
        
        while (count <= questionsAsked + 1)
        {
            String line = sc.nextLine();
            
            String[] str = line.split(" ");
            timeAndAwserList.add(new TimeAndAnwser(Integer.parseInt(str[0]), str[1]));
            count++;
        }      
        Solution();
        sc.close();
    }

    void Solution()
    {
        for (var item : timeAndAwserList)
        {
            time += item.getTime();
            //System.out.println(time);
            if(time >= 210) break;
            if ( item.getAnwser().equals("T"))
            {
                if (labels != 8) labels++;
                else labels = 1;   
            }
        }

        System.out.println(labels);
    }

    void Reset()
    {
        count = 2;
        time = 0;
        timeAndAwserList.clear();
    }
}