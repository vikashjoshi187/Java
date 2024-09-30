import java.util.Scanner;

public class prog_39 {
//39)Java Program to Remove Duplicate Elements from Array
static Scanner sc = new Scanner(System.in);
    int arr[], s;

    prog_39(int arr1[], int s1) {
        this.arr = arr1;
        this.s = s1;

    }

    void getElement() {
        System.out.println("Enter the Array Elements in array 1");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

    void remvdupli() {

        int counted = -1;
        for (int i = 0; i < s; i++) {
            for (int j = i + 1; j < s; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = counted;
                }
            }
        }
        System.out.println("Array After Removing Duplicate Elements ");
        for (int i = 0; i < s; i++) {
            if (arr[i] != counted) {
                System.out.print(arr[i]+"\t");
            }
        }System.out.println();

    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of Array ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        prog_39 obj = new prog_39(arr, s);
        obj.getElement();
        obj.remvdupli();

    }
}

