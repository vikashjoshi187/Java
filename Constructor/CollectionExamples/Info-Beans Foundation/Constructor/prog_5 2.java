import java.util.Scanner;

public class prog_5 {
    // 18)WAP to insert an element at specific index in an array
    int a;
    int arr1[];

    prog_5(int a) {
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

    int remEle() {
        Scanner sc = new Scanner(System.in);

        int grt = arr1[0];
        for (int k = 0; k < arr1.length; k++) {
            if (arr1[k] > grt) {
                grt = arr1[k];

            }
        }

        int max2 = arr1[0];
        for (int j = 0; j < arr1.length; j++) {
            if (arr1[j] > max2 && arr1[j] < grt)
                max2 = arr1[j];
        }

        System.out.println();

        System.out.println(" the second Largest elent is elemnt");
        return max2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int a = sc.nextInt();

        prog_5 obj = new prog_5(a);
        obj.arryC();

        System.out.println(obj.remEle());

    }
}
