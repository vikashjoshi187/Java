import java.util.Scanner;

public class pattern_93 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        int count = 1;
        while (i <= a) {
            int j = i;
            while (j >= 1) {

                System.out.print(j + " ");

                j--;
            }
            System.out.print("\n");
            i++;
            count = i;
        }

    }

}
