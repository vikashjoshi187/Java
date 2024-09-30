import java.util.Scanner;
public class prog_58 {
    //58) Max Sum in configuration
    static Scanner sc = new Scanner(System.in);
    int size, arr[];

    prog_58(int arr[],int size) {
        this.arr = arr;
        this.size = size;
    }

    void getElement() {
        System.out.println("Enter the elements of the array-1 ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
    }

    void maxSum() {
        int count = size;
        // for (int i = 0; i < size; i++) {
        //     count++;
        // }
        int j=0;
        int arr1[] = new int[size];
        do {
            int temp = arr[0];
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size - 1] = temp;
            int sum = 0,i;
            for (i = 0; i < size; i++) {
                sum = sum + (arr[i] * i);
            }
            arr1[j++] = sum;
            count--;
        } while (count > 0);

        for (int i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr1[i] > arr1[j]){
                int temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;
                }
            }
        }
        System.out.print("The Maximum Sum is -> "+arr1[size-1] + "\t");
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array ");
		int size = sc.nextInt();
		int arr[] = new int [size];
        prog_58 obj = new prog_58(arr,size);
        obj.getElement();
        obj.maxSum();
	}
}