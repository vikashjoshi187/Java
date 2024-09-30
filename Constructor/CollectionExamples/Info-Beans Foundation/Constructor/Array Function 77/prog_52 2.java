import java.util.Scanner;
public class prog_52 {
	//52) Count pair with given sum.
	//Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

    static Scanner sc = new Scanner(System.in);
    int size, arr[],arr1[];

    prog_52(int arr[], int s) {
        this.arr = arr;
        this.size = s;
    }

    void sum() {
        System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter Number to Check Sum Of Elememts");
		int s = sc.nextInt(),count = 0;
		for (int i = 0; i < size; i++){
			for (int j = i + 1; j < size; j++){
				if ((arr[i] + arr[j]) == s){
					count++;
				}
			}
		}
		System.out.println("Number of Pairs Giving Sum Of Given Numbe "+count);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		int arr[] = new int [size];
        prog_52 obj = new prog_52(arr,size);
        obj.sum();
	}
}