import java.util.Scanner;

public class prog_26 {
    // WAP to reverse all the elements of an array
    int arr[], size;

    void setData(int arr[], int size) {
        this.arr = arr;
        this.size = size;
    }

    void reverse() {
        int temp;
        for (int i = 0; i < size / 2; i++) {
            temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }
        System.out.println("Reverse Array elements are");
        for (int a : arr) {
            System.out.print("\t" + a);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        prog_26 obj = new prog_26();
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        obj.setData(arr, size);
        obj.reverse();

    }
}
