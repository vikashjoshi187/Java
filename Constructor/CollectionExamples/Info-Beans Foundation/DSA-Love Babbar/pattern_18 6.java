import java.util.Scanner;

public class pattern_18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of row and col ");
        int n = sc.nextInt();
        int i = 1;
        int c = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (j <= n-i) {
                    System.out.print(" ");
                } else {
                    System.out.print(c);
                }
                j++;

            }
            System.out.println();
            c++;

            i++;
        }

    }
}
