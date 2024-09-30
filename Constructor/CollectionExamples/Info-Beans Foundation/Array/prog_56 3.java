import java.util.Scanner;

public class prog_56 {
    // 51) Given an unsorted array arr[] of size N having both negative
    // and positive integers. The task is place all negative element at
    // the end of array without changing the order of positive element
    // and negative element.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the elementsof array");
        int s = sc.nextInt();
        int arr[] = new int[s];

        System.out.println("Enter the elents of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        for (int j = 0; j < arr.length; j++) {
                if (arr[j] < 0) {
                    int temp = arr[j];
                    for (int k = 0; k < arr.length-1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    arr[s - 1] = temp;
                }
            }
        
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            }


    }
}
