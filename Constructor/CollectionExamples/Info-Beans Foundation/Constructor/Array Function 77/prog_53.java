import java.util.Scanner;
class prog_53 {
	//53) Find common elements in three sorted arrays.
//Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.

    static Scanner sc = new Scanner(System.in);
    int size, arr[],arr1[],arr2[],size1,size2;

    prog_53(int arr[],int arr1[],int arr2[],int size,int size1,int size2) {
        this.arr = arr;
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.size = size;
        this.size1 = size1;
        this.size2 = size2;
    }

    void getElement() {
        System.out.println("Enter the elements of the array-  ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the elements of the array-  ");
		for (int i = 0; i < size1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the elements of the array-  ");
		for (int i = 0; i < size2; i++) {
			arr2[i] = sc.nextInt();
		}
    }

    void sum() {
        int min_size = 0,common_element=0;
		if (size<size1 && size<size2)
        	min_size = size;
		else if (size1<size2)
		    min_size = size1;
		else
		    min_size = size2;

		int temp[] = new int[min_size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size1; j++) {
				for (int k = 0; k < size2; k++) {
					if (arr[i] == arr1[j]){
						if (arr[i] == arr2[k]){
							temp[common_element++] = arr[i];
						}
					}
				}
			}
		}
		System.out.println("Commom Elements In All Arrays Ar  ");
		for (int i = 0;i < common_element;i++){
		System.out.print(temp[i]+"\t");
		}System.out.println();
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array 1");
		int size = sc.nextInt();
		int arr[] = new int [size];
        System.out.print("Enter the Size of the array 2");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
        System.out.print("Enter the size of the array 3");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
        prog_53 obj = new prog_53(arr,arr1,arr2,size,size1,size2);
        obj.getElement();
        obj.sum();
	}
}