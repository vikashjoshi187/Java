import java.util.Scanner;
class prog_32 {
    // WAP to search an element from an array using Binary search
    static Scanner sc = new Scanner(System.in);
    int arr[],s;

    prog_32(int arr[], int s) {
        this.arr = arr;
        this.s = s;
    }

    void getElement() {
        System.out.println("Enter the Array Elements is Ascending order  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void show() {
        System.out.println("Array Elements are ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }System.out.println();
    }

    void binaryS(int arr1[]) {
        System.out.println("Enter Element for Search ");
        int vl = sc.nextInt();
        int l = 0, h = s - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr1[mid] == vl) {
                System.out.println("The Element is at the Position  " + mid);
                break;
            } else if (vl > arr1[mid]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        if (l > h) {
            System.out.println("Element is not in the Array");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of Array  ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        prog_32 obj = new prog_32(arr, s);
        obj.getElement();
        obj.show();
        obj.binaryS(obj.arr);
    }
}