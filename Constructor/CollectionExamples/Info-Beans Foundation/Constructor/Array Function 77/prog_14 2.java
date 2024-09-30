import java.util.Scanner;
public class prog_14 {
    // 14)WAP to count no. Of elements which lies in between 50 and 100
    static Scanner sc = new Scanner(System.in);
    int a, arr1[];
    prog_14(int arr1[], int a) {
        this.a = a;
        this.arr1 = arr1;
    }

    void arryC() {
        System.out.println("Enter Array Elemnts ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
    }

    int lieB() {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 50 && arr1[i] < 100) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of Array  ");
        int a = sc.nextInt();
        int arr1[] = new int[a];
        prog_14 obj = new prog_14(arr1, a);
        obj.arryC();
        System.out.println("The Number of Elemnts in the Arrry lie between 50 and 100 are " + obj.lieB());
    }
}