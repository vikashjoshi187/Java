import java.util.Scanner;
public class prog_48 {
    // 43) Java Program to Move All Zeros to the Start of an Array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the siz if array");
        int s = sc.nextInt();

        int arr[] = new int[s];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;  
                }
            }
        }

        System.out.println("\n\n\n\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        sc.close();
    }
}
