
import java.util.Scanner;

public class prog_22 {
    // 17)WAP to reverse individual elements of an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of number you want to add");
        int num = sc.nextInt();
        int arr1[] = new int[num];
        int rem = 0, rev = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
            num = arr1[i];
            while (num > 0) {
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            
            arr1[i] = rev;
            rem = 0;
            rev = 0;

        }
        System.out.println("\n\n\n\n");

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }

    }
}
