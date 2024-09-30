import java.util.Scanner;

public class pattern_43 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        int n = 1;
        while (i <= a) {
            int j = a;
            while (j >= 1) {

                System.out.print(n + " ");
                n++;
                j--;
            }
            System.out.print("\n");
            i++;
        }

    }

}
