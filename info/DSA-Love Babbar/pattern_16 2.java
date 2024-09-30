import java.util.Scanner;

public class pattern_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of row and col ");
        int n = sc.nextInt();
        int i = n;
        int c = 1;
        while (i >= 1) {
            int j = 1;
            while (j <= n) {
                if (j < c) {
                    System.out.print(" ");
                } else {
                    System.out.print(c);
                }
                j++;

            }
            System.out.println();
            c++;

            i--;
        }

    }
}
