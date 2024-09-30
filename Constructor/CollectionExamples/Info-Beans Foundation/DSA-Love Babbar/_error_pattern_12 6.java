import java.util.Scanner;

public class _error_pattern_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of lines");
        int n = sc.nextInt();
        char alpha = 'D';
        int i = 1;
        while (i <= n) {

            int j = 1;
            while (j <= i) {

                System.out.print(alpha);
                alpha--;
                j++;
            }
            System.out.println();
            i++;

        }

    }

}
