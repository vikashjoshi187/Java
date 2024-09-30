import java.util.Scanner;

public class prog_10 {
    // WAP to take marks of 7 subjects from a user and print it.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of number you want to add");
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
        System.out.println(sum);

    }
}
