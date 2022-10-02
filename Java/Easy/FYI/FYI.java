import java.util.Scanner;
import java.io.File;

public class FYI
{
    public static void main(String[] args) throws Exception
    {
        String input = null;
        String firstThree = null;
        String output = null;

        // Read file.
        //File inputFile = new File("C:/Users/zeb_a/Documents/Kattis/Java/Easy/FYI/fyi/a001.in");
        
        try
        {
            //Scanner sc = new Scanner(inputFile);
            Scanner sc = new Scanner(System.in);
            //While loop used to get input and read input from Kattis
            while(sc.hasNextLine())
            {
                // Get the input, spit it after the first three digits and then compaire it printing 1 or 0 depending on the number.
                input = sc.nextLine();
                firstThree = input.substring(0, 3);

                if(firstThree.equals("555")) output = "1";
                else output = "0";
                System.out.println(output);
            }
            sc.close();

        }
        catch(Exception e)
        {
            System.out.println("Something happend \n");
            e.printStackTrace();
        }
    }
}