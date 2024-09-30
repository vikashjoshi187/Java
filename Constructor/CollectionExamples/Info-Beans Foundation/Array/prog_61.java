import java.util.Scanner;
public class prog_61 {
    // 55) Find the first non-repeating element in the array
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the s of the array ");
		int s = scanner.nextInt();
		int[] arr = new int[s];
		for (int i = 0; i < s; i++) {
			System.out.print("Enter an integer ");
			arr[i] = scanner.nextInt();
		}
		int firstNonRepeating = 0;
		for (int i = 0; i < s; i++) {
			int count = 0;
			for (int j = 0; j < s; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				firstNonRepeating = arr[i];
				break;
			}
		}
		if (firstNonRepeating == 0) {
			System.out.println("All elements repeat");
		} else {
			System.out.println("The first non-repeating element is: " + firstNonRepeating);
		}
	}
}