import java.util.Scanner;

public class prog_59 {
    //54 aayega) Count pair with given sum.
    //Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the emelents in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entet the number for checking the pair");
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }
        System.out.println("The number of pair who,s sum is equal to " + k + " is " + count);
    }
}
