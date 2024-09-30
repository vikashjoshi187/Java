import java.security.spec.ECPublicKeySpec;
import java.util.Scanner;

public class prog_31 {
    // WAP to check whether entered array is a palindrome or not
    int arr[], size;

    void setData(int arr[], int size) {
        this.arr = arr;
        this.size = size;
    }

    void palindrome() {
        int temp;
        for (int i = 0; i < size; i++) {
            if (arr[i] != arr[size - 1 - i]) {
                System.out.println("Array is not palindrome");
                System.exit('a');
            }
        }
        System.out.println("Array is palindrome");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        prog_31 obj = new prog_31();
        obj.setData(arr, size);
        obj.palindrome();
    }
}
