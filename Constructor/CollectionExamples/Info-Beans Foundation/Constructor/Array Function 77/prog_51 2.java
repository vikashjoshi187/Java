import java.util.Scanner;
public class prog_51 {
//51) Given an unsorted array arr[] of size N having both negative and 
//positive integers. The task is place all negative element at the end 
//of array without changing the order of positive element and negative element.
    static Scanner sc = new Scanner(System.in);
    int size, arr[],arr1[];

    prog_51(int arr[],int arr1[], int s) {
        this.arr = arr;
        this.arr1 = arr1;
        this.size = s;
    }

    void NegativeEnd() {
        System.out.println("Enter Elements of Array ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
			System.out.println("Array Elememts Are ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		int j = 0;
		for (int i = 0; i < size; i++){
			if (arr[i] >= 0)
			arr1[j++] = arr[i];
		}
		for (int i = 0; i < size; i++){
			if (arr[i] < 0)
			arr1[j++] = arr[i];
		}
		System.out.println("\nArray After Separating Negative And Positive");
		for (int i = 0; i < size; i++){
			System.out.print(arr1[i]+"\t");
		}System.out.println();

    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array ");
		int size = sc.nextInt();
		int arr[] = new int [size];
		int arr1[] = new int [size];
        prog_51 obj = new prog_51(arr,arr1,size);
        obj.NegativeEnd();
	}
}