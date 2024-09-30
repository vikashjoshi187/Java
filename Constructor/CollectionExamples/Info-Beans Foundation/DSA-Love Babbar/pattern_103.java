import java.util.Scanner;

public class pattern_103 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        char count = 'A';
        while (i <= a) {
            int j = 1;
            while (j <= a) {

                System.out.print(count + " ");

                j++;
            }
            System.out.print("\n");
            count++;
            i++;

        }

    }

}
