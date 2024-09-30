import java.util.Scanner;

public class prog_39 {
	// 34)WAP showing the concept of Insertion sort

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Elements ");
		for (int i = 0; i < size; i++) {
			System.out.println("Element " + i);
			arr[i] = sc.nextInt();
		}
		boolean flag = false;
		int i, j;
		// insertion sort
		for (i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > temp) {
					arr[j + 1] = arr[j];
					flag = true;
				} else {
					break;
				}
			}
			if (flag) {

				arr[j + 1] = temp;

			}

		}

		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

	}
}