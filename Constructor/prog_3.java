import java.util.Scanner;

public class prog_3 {
    // 18)WAP to insert an element at specific index in an array
    int a;
    int arr1[];

    prog_3(int a) {
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

    int[] addEle() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the inxex for new element");
        int i = sc.nextInt();
        System.out.println("Enter the value");
        int vl = sc.nextInt();

        for (int j = arr1.length - a; j >= i; j--) {
            arr1[j + 1] = arr1[j];
        }
        
        arr1[i] = vl;
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + "\t");
        }

        System.out.println("Arrya after adding the elemnt");
        return arr1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int a = sc.nextInt();

        prog_3 obj = new prog_3(a);
        obj.arryC();

        int arr[] = new int[a];
        arr = obj.addEle();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }

    }
}
