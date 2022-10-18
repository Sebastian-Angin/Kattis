import java.util.Scanner;

/**
 * FizzBuzz
 */
public class FizzBuzz {

    public static void main(String[] args) {
        try
        {
            long divOne, divTwo, range;
            Scanner sc = new Scanner(System.in);
            

            while(sc.hasNextLong())
            {
                divOne = sc.nextLong();
                divTwo = sc.nextLong();
                range = sc.nextLong();
                
                for (int i = 1; i <= range; i++) {
                    if (i%divOne == 0 && i%divTwo == 0) System.out.println("FizzBuzz");
                    else if(i%divOne == 0) System.out.println("Fizz");
                    else if(i%divTwo == 0) System.out.println("Buzz");
                    else System.out.println(i);
                }
                
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