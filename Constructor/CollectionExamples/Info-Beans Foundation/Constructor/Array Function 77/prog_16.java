import java.util.Scanner;
public class prog_16 {
    // 16)WAP to reverse all the elements of an array
    static Scanner sc = new Scanner(System.in);
    int a,arr[];
    
    prog_16(int arr[], int a) {
        this.a = a;
        this.arr = arr;
    }

    void arryC() {
        System.out.println("Enter Arrya Elemnts ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    int[] revArr() {
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }
        System.out.println("reversed arry Ements are");
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of array");
        int a = sc.nextInt();
        int arr[]=new int[a];
        prog_16 obj = new prog_16(arr, a);
        obj.arryC();
        arr=obj.revArr();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t"+arr[i]);
        }
    }
}