// 39)Java Program to Remove Duplicate Elements from Array
import java.util.Scanner;
public class prog_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int frequency[] = new int[arr.length];
        System.out.println("Enter The Elements Of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int counted = -1;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = counted;
                }
            }
        }
        System.out.println("Array After Removing Duplicate Elements ");
        for (int i = 0; i < size; i++) {
            if (arr[i] != counted) {
                System.out.print(arr[i]+"\t");
            }
        }System.out.println();
    }
}