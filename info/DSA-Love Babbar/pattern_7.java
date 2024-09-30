import java.util.Scanner;

public class pattern_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        int count =1;
        while (i <= a) {
            int j = 1;
            while (j <= i) {

                System.out.print( count +" ");
            count++;
                j++;
            }
            System.out.print("\n");
            i++;
        }

    }

}
