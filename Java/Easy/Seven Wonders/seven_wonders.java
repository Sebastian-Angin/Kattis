import java.util.Scanner;
import java.util.*;

/**
 * finding_an_a
 */
public class seven_wonders
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       
        while(sc.hasNextLine())// sc.hasNextLong)
        {
            //Creating a char array to stor the chars that will be the key
            char[] strArray = sc.nextLine().toCharArray();
            int sum = 0;
            int oneOfEach = 0;
            //Hashmap to map char to how many times its repeated
            HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

            //Going through each char in the array and storing it in the hashmap. Then we add one everytime its repeated.
            for (char c : strArray)
            {
                if (charCountMap.containsKey(c))
                {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                }
                else
                {
                    charCountMap.put(c, 1);
                }
            }
            // Looping through the map to calculate the totla sum
            for (Map.Entry entry : charCountMap.entrySet())
            {
                //If there are more than three than we know there is 1 of each type.
                if (charCountMap.size() == 3) {
                    //setting starting value if oneOfEach is 0
                    oneOfEach = oneOfEach == 0? (int)entry.getValue(): oneOfEach;
                    //We want to get the lowest value. So where checking to see which is the lowest.
                    oneOfEach = oneOfEach > (int)entry.getValue()? (int)entry.getValue(): oneOfEach;
                }
                //Calculate the sum as a power of to for each value
                sum += Math.pow((int)entry.getValue(), 2);
            }
            //Adding the final points based on how many oneOfEach there are.
            System.out.println((sum + oneOfEach * 7));

            
        }
        sc.close();
    }
}