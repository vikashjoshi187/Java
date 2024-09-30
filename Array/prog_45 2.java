import java.util.Scanner;

public class prog_45 {
    //40) Java Program to Cyclically Permute the Elements of an Array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int s = sc.nextInt();

        int arr[] = new int[s];
        System.out.println("Enter the element so array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {

            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;

       
       
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

    }

}
