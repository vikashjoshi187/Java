import java.util.Scanner;

public class prog_47 {
    // 42) Java Program to Split an Array from Specified Position
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizE if array");
        int s = sc.nextInt();

        int arr[] = new int[s];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the split index");
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

}
