import java.net.SocketImpl;
import java.util.Scanner;

public class prog_28 {
    // )WAP to insert an element at specific index in an array
    int arr[], size, index, value;

    void setData(int arr[], int size, int index, int value) {
        this.arr = arr;
        this.size = size;
        this.index = index;
        this.value = value;
    }

    int[] specificIndex() {
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;
        return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        prog_28 obj = new prog_28();
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        System.out.println("Enter Array elements");
        int arr[] = new int[size + 1];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter index where u want to insert ");
        int index = sc.nextInt();
        System.out.println("Enter value");
        int value = sc.nextInt();
        obj.setData(arr, size, index, value);
        int array[] = obj.specificIndex();
        System.out.println("Array elements after insertion are :");
        for (int a : array) {
            System.out.print("\t" + a);
        }
    }
}