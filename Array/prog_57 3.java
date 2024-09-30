import java.util.Scanner;
public class prog_57 {
	//52) Count pair with given sum.
//Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter Number to Check Sum Of Elememts ");
		int s = sc.nextInt(),count = 0;
		for (int i = 0; i < size; i++){
			for (int j = i + 1; j < size; j++){
				if ((arr[i] + arr[j]) == s){
					count++;
				}
			}
		}
		System.out.println(count);

    }
    
}
