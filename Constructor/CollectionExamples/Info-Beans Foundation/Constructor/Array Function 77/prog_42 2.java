import java.util.Scanner;

public class prog_42 {
    //42) Java Program to Split an Array from Specified Position
static Scanner sc = new Scanner(System.in);
    int arr[], s;

    prog_42(int arr1[], int s1) {
        this.arr = arr1;
        this.s = s1;

    }

    void getElement() {
        System.out.println("Enter the Array Elements in array 1");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

    void splitArr() {

        System.out.println("Enter the split position");
        int si = sc.nextInt();

        int arr2[] = new int[arr.length - si];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[si + i];

        }

        System.out.println("the splited first array");
        for (int i = 0; i < si; i++) {
            System.out.println(arr[i]);

        }

        System.out.println("the splited second array");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);

        
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of Array ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        prog_42 obj = new prog_42(arr, s);
        obj.getElement();
        obj.splitArr();

    }
}





