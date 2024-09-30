import java.util.Scanner;

public class prog_30 {
    //24)WAP to find out the largest element from an array

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int grt = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>grt) {
                    grt=arr[i];
                    
                }
            }
        System.out.println("\n The gretest number in the array is "+grt);

    }
}