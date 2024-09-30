import java.util.Scanner;

public class prog_29 {
    // WAP to remove an element from a specific index
    int arr[], size, index;

    void setData(int arr[], int size, int index) {
        this.arr = arr;
        this.size = size;
        this.index = index;
    }

    int[] Remove() {
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        prog_29 obj = new prog_29();
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter index where you want to delete element");
        int index = sc.nextInt();
        obj.setData(arr, size, index);
        int array[] = obj.Remove();
        System.out.println("Array elements after deletion");
        for (int i = 0; i < size - 1; i++) {
            System.out.print("\t" + arr[i]);
        }
    }
}
