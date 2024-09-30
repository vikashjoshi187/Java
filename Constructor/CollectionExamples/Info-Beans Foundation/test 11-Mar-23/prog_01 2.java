
/**
 * prog_01
 */
import java.util.Scanner;

public class prog_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int r = sc.nextInt();

        for (int i = 0; i <= r; i++) {

            for (int j = 1; j <= r-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <=i ; j++) {
                int facti = 1;
                int factj = 1;
                int factij = 1;
                
                for (int x = 1; facti <= i; x++) {

                    facti = facti * x;
                }
                
                for (int x = 1; factj <= j; x++) {

                    factj = factj * x;
                }
                
                for (int x = 1; factij <= i - j; x++) {

                    factij = factij * x;
                }
                    System.out.print((facti / (factj * factij))  + " ");

            

            }
            System.out.println();

        }

    }
}