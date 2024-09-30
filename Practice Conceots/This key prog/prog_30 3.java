import java.util.Scanner;

public class prog_30 {
    // )WAP to merge two arrays
    int arr1[], arr2[], size1, size2;

    void setData(int arr1[], int arr2[], int size1, int size2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.size1 = size1;
        this.size2 = size2;
    }

    int[] merge() {
        for (int i = size1, j = 0; i < size1 + size2 && j < size2; i++, j++) {
            arr1[i] = arr2[j];
        }
        return arr1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        prog_30 obj = new prog_30();
        System.out.println("Enter size of 1st array");
        int size1 = sc.nextInt();
        System.out.println("Enter size of 2nd array");
        int size2 = sc.nextInt();
        System.out.println("Enter 1st array element");
        int arr1[] = new int[size1 + size2];
        int arr2[] = new int[size2];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter 2nd array element");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        obj.setData(arr1, arr2, size1, size2);
        int array[] = obj.merge();
        System.out.println("Array element after merging");
        for (int a : array) {
            System.out.print("\t" + a);
        }

    }
}
