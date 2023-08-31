import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        //System.out.println("test");
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLong()) {
            long inputOne = sc.nextLong();
            long inputTwo = sc.nextLong();
            float output = inputOne * inputTwo / 2f;
            System.out.println(output);
        }
    }
}