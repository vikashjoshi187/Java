import java.util.Scanner;

public class prog_32 {
    // )WAP showing the concept of Selection sort (Ascending order | Descending
    // order)
    int arr[], size;

    void setData(int arr[], int size) {
        this.arr = arr;
        this.size = size;
    }

    int[] Selection() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        prog_32 obj = new prog_32();
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        obj.setData(arr, size);
        int array[] = obj.Selection();
        System.out.println("Array of element in decresing order using selection sort is :");
        for (int a : array) {
            System.out.print("\t" + a);
        }
    }
}
