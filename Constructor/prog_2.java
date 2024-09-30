import java.util.Scanner;

public class prog_2 {
    // 16)WAP to reverse all the elements of an array
    int a;
    int arr1[];

    prog_2(int a) {
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

    int[] revArr() {
        for (int i = 0; i < arr1.length / 2; i++) {
            int t = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = t;

        }
        System.out.println("reversed arry Ements are");
        return arr1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int a = sc.nextInt();

        prog_2 obj = new prog_2(a);
        obj.arryC();

        int arr[]=new int[a];
        arr=obj.revArr();
 

        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t"+arr[i]);
        }


    }
}
