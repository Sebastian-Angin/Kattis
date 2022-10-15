import java.util.Scanner;

/**
 * Jack_O_Lantern
 */
public class Jack_O_Lantern {

    public static void main(String[] args) {
        try {
            long eyes, nose, mouths;
            Scanner sc = new Scanner(System.in);

            while (sc.hasNextLong()) {
                eyes = sc.nextLong();
                nose = sc.nextLong();
                mouths = sc.nextLong();

                long result = eyes * nose * mouths;

                System.out.println(result);
            }
            sc.close();

        } catch (Exception e) {
            System.out.println("Something happend \n");
            e.printStackTrace();
        }
    }
}