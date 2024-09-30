import java.util.Scanner;

public class prog_09 {
    // WAP to take marks of 7 subjects from a user and print it.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 7 subjects");
        int arr[] = new int[7];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter marks of " + (i + 1) + " subject ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\n\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The marks of subject " + (i + 1) + " is " + arr[i]);
        }

    }
}
