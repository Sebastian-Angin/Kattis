import java.util.*;

/**
 * finding_an_a
 */
public class weak_vertices
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String output, input;
        int sumOfVertices = 0;
        int loops = 0;
        int numbersOfVertices = sc.nextInt();
        List<Integer> weakVertices = new ArrayList<Integer>();
        System.out.println("Starting");
       
        while(loops >= numbersOfVertices )// sc.hasNextLong)
        {
            // Get the input, spit it after the first three digits and then compaire it printing 1 or 0 depending on the number.
            input = sc.nextLine();
            for (char c : input.toCharArray()) {
                sumOfVertices += c;
            }
            System.out.println(sumOfVertices);
            output = input;
            //System.out.println(numbersOfVertices);
            //System.out.println(output);
            loops++;
        }
        sc.close();
    }
}
