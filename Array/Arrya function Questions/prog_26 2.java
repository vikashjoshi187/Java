import java.util.Scanner;

public class prog_26 {
    // 39 arry file
    void insertion_Sort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th size of array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        boolean flag = false;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Element " + (i + 1));
            arr[i] = sc.nextInt();
        }
        int i, j;

        for (i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > temp) {
					arr[j + 1] = arr[j];
					flag = true;
				} else {
					break;
				}.
			}
			if (flag) {

				arr[j + 1] = temp;

			}

		}

        for (int k = 0; i < arr.length; k++) {
        System.out.println("\t"+arr[k]);
        }

  

    }

    public static void main(String[] args) {
        prog_26 obj = new prog_26();
        obj.insertion_Sort();
    }

}
