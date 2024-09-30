import java.util.Scanner;

public class prog_47 {
    // 47) WAP to swap adjacent elements of a one dimensional array
    static Scanner sc = new Scanner(System.in);
    int arr1[], s1;

    prog_47(int arr1[], int s1) {
        this.arr1 = arr1;
        this.s1 = s1;

    }

    void getElement() {
        System.out.println("Enter the Array Elements in array 1");
        for (int i = 0; i < s1; i++) {
            arr1[i] = sc.nextInt();
        }

    }

    int[] adjEleswp() {
        System.out.println("\n\n");

        int s = arr1.length;
        if (arr1.length % 2 != 0) {
            s = arr1.length - 1;

        }

        for (int i = 0; i < s; i = i + 2) {
            int temp = arr1[i];
            arr1[i] = arr1[i + 1];
            arr1[i + 1] = temp;
        }
        return arr1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of Array 1");
        int s1 = sc.nextInt();

        int arr1[] = new int[s1];

        prog_47 obj = new prog_47(arr1, s1);
        obj.getElement();
        obj.adjEleswp();
        arr1 = obj.arr1;
        for (int i = 0; i < arr1.length; i++) {

            System.out.println("\t" + arr1[i]);

        }

    }
}
