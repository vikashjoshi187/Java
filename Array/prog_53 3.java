import java.util.Scanner;
public class prog_53 {
    //48) WAP to split an array and add the first half after the second half of the array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // Taking input for the position to split the array
        System.out.print("Enter the position to split the array: ");
        int pos = sc.nextInt();

        for (int i = 0; i < pos; i++) {

            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];

            }
            arr[arr.length - 1] = temp;

        }
        System.out.println("The modified array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
