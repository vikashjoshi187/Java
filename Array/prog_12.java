import java.util.Scanner;

public class prog_12 {
    // WAP to take n number of elements of an array from user and find out the sum of even indexing elements.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of number you want to add");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter numver "+i);
            arr[i] = sc.nextInt();
        }
        System.out.println("\n\n");
        
        for (int i = 2; i < arr.length; i=i+2) {
            sum = sum + arr[i];

        }
        System.out.println(sum);

    }
}
