import java.util.Scanner;

public class pattern_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
System.out.println("enter no of rows an col");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {

            int j = 1;
            while (j <= n) {

                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
