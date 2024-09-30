import java.util.Scanner;

public class prog_40 {
 //40) Java Program to Cyclically Permute the Elements of an Array
static Scanner sc = new Scanner(System.in);
    int arr[], s;

    prog_40(int arr1[], int s1) {
        this.arr = arr1;
        this.s = s1;

    }

    void getElement() {
        System.out.println("Enter the Array Elements in array 1");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

    void CyclPrmt() {

        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {

            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;

        System.out.println("Arry after  Cyclically Permute");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("\t"+arr[i]);
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of Array ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        prog_40 obj = new prog_40(arr, s);
        obj.getElement();
        obj.CyclPrmt();

    }
}




