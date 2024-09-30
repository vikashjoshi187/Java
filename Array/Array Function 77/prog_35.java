import java.util.Scanner;
public class prog_35 {
	
	// java program showing concept of merge sort.
	void printArray(int[] arr) {
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

	void conquer(int arr[], int si, int mid, int ei) {
		int merged[] = new int[ei - si + 1];
		int index1 = si;
		int index2 = mid + 1;
		int count = 0;
		while (index1 <= mid && index2 <= ei) {
			if (arr[index1] <= arr[index2]) {
				merged[count++] = arr[index1++];
			} else {
				merged[count++] = arr[index2++];
			}
		}

		while (index1 <= mid) {
			merged[count++] = arr[index1++];
		}

		while (index2 <= ei) {
			merged[count++] = arr[index2++];
		}

		for (int i = 0, j = si; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}
		

	}

	void divide(int arr[], int si, int ei) {
		if (si < ei) {
			int mid = (si + ei) / 2;
			divide(arr, si, mid);
			divide(arr, mid + 1, ei);
			conquer(arr, si, mid, ei);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        prog_35 obj=new prog_35();
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		System.out.println("Given Array");
		obj.printArray(arr);

		obj.divide(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		obj.printArray(arr);
	}
}
