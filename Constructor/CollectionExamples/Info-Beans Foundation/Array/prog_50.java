import java.util.Scanner;
public class prog_50 {
    //45) WAP to check prime numbers in an array

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			int count = 0;
			for (int j = 1; j <= arr[i] / 2; j++) {
				if (arr[i] % j == 0) {
					count++;
				}
			}
			if (count == 1)
			System.out.println(arr[i]+" Prime Number ");
			else 
			System.out.println(arr[i]+" Not Prime Number");
		}
	}
}