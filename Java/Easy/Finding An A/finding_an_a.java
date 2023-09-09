import java.util.Scanner;

/**
 * finding_an_a
 */
public class finding_an_a
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String output, input;
        //System.out.println("Starting");
       
        while(sc.hasNextLine())// sc.hasNextLong)
        {
            input = sc.nextLine();
            //Geting the index of the fist A in the string
            int indexOfA = input.indexOf("a", 0);
            //Filling the output with the remaining letters after using substring to remove everything before
            output = input.substring(indexOfA);
            System.out.println(output);
        }
        sc.close();
    }
}