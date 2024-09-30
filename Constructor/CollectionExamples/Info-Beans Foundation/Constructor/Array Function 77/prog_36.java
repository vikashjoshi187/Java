import java.util.Scanner;
public class prog_36 {
	// java program showing concept of quick sort.

	 int partition(int[] arr, int si, int ei) {
		int pivot = arr[ei];
		int i = si - 1;
		for (int j = si; j < ei; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[ei];
		arr[ei] = temp;
		return i;
	}

	 void quickSort(int arr[], int si, int ei) {
		if (si < ei) {
			int pidx = partition(arr, si, ei);
			quickSort(arr, si, pidx - 1);
			quickSort(arr, pidx + 1, ei);
		}
	}

	 void printArray(int[] arr) {
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		prog_36 obj=new prog_36();
		System.out.println("Enter Size of Array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Elements ");
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		System.out.println("Given Array ");
		obj.printArray(arr);

		obj.quickSort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		obj.printArray(arr);
	}
}