import java.util.Scanner;
import java.util.*;
import java.math.*;

/**
 * ladder
 */
public class ladder {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Starting");
       
        while(sc.hasNext())// sc.hasNextLong)
        {
           int height = sc.nextInt();
           int angle = sc.nextInt();
           double sin = Math.sin(Math.toRadians(angle));
        // System.out.println(sin);
        int soulution = (int)Math.ceil(height / sin) ;
        System.out.println(soulution);

        }
    }
}

