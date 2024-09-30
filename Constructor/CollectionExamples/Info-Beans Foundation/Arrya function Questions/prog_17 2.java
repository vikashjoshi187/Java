import java.util.Scanner;

public class prog_17 {
    // 17)WAP to take n number of elements of an array and find out the sum of first
    // and last element of an array.
    void marks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th size of array");

        int s=sc.nextInt();
        int arr[] = new int[s];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Element " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum of first and last elemnt is " + (arr[0] + arr[arr.length - 1]));
    }

    public static void main(String[] args) {
        prog_17 obj = new prog_17();
        obj.marks();
    }

}
