import java.util.Scanner;

public class prog_4 {
    // 19)WAP to remove an element at specific index in an array
    int a;
    int arr1[];

    prog_4(int a) {
        this.a = a;
    }

    void arryC() {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[a];
        System.out.println("Enter Arrya Elemnts ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        this.arr1 = arr1;
    }

    int[] remEle() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the index to remove element");
        int i = sc.nextInt();

        for (int j = arr1.length - a; j >= i; j--) {
            arr1[j + 1] = arr1[j];
        }
        for (int j = i; j < a - 1; j++) {

            arr1[j] = arr1[j + 1];

        }
        System.out.println();

        System.out.println("Arrya after removing the elment the elemnt");
        return arr1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int a = sc.nextInt();

        prog_4 obj = new prog_4(a);
        obj.arryC();

        int arr[] = new int[a];
        arr = obj.remEle();

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("\t" + arr[i]);
        }

    }
}
