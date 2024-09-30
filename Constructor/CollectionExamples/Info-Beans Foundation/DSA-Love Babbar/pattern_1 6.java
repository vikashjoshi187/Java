import java.util.Scanner;

/**
 * pattern
 */
public class pattern_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a rows");
        int a = sc.nextInt();
        System.out.println("enter the num of col");
        int b = sc.nextInt();

        int c = 1;
        while (c <= a) {
            int r = 1;
            while (r <= b) {

                System.out.print(c);
                r++;
            }
            System.out.print ("\n");
            c++;
        }

    }
}