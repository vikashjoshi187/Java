import java.util.Scanner;

public class prog_11 {
    // WAP to take n number of elements of an array from user and find out the average of all the elements.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of number average you want");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter numver " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("\n\n");
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println("The average is "+sum/num);

    }
}
