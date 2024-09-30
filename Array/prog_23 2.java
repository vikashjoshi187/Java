
import java.util.Scanner;

public class prog_23 {
    //18)WAP to insert an element at specific index in an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of number you want to add");
        int num = sc.nextInt();
        int arr1[] = new int[num];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("enter index for chnging value");
        int in=sc.nextInt();
        System.out.println("enter the new value for the index");
        int vl=sc.nextInt();

        arr1[in]=vl;
        System.out.println("\n");

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }

    }
}
