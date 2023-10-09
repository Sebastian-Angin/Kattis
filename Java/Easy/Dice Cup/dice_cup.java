import java.util.Scanner;

/**
 * dice_cup
 */
public class dice_cup
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Starting");
       
        while(sc.hasNextInt())// sc.hasNextLong)
        {
            //Store the dices in ints
            int diceOne = sc.nextInt();
            int diceTwo = sc.nextInt();

            //If the dice are the same, we can print dice max value + 1
            if (diceOne == diceTwo) {
                System.out.println(diceOne + 1);
            }
            else
            {
                //If they are not the same we need to first fine which is the lowest die in order to determine the starting value
                //The list always starts from the lowest number + 1
                int lowestDie = (diceOne > diceTwo) ? diceTwo: diceOne;
                int startingValue = lowestDie + 1;
                // Then we calculate the lenght of the for loop that will print anwser. Using abs to make sure that we have a positive number.
                int length = (Math.abs(((diceOne + 1) - (diceTwo + 1))) + 1) + startingValue;
                for (int i = startingValue; i < length; i++)
                {
                    System.out.println(i);
                }
                
            }
        }
        sc.close();
    }
}
