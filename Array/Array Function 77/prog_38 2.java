import java.util.Scanner;

public class prog_38 {
//38)Java Program to Print Next Greater Element in Array

    static Scanner sc = new Scanner(System.in);
    int arr1[], s1;

    prog_38(int arr1[], int s1) {
        this.arr1 = arr1;
        this.s1 = s1;

    }

    void getElement() {
        System.out.println("Enter the Array Elements in array 1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

    }

    void nxtgrtele() {

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i; j < arr1.length; j++) {
                if (arr1[i] < arr1[j]) {
                    System.out.println("The next freater element for " + arr1[i] + " is " + arr1[j]);
                    break;
                }
            }

        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of Array ");
        int s1 = sc.nextInt();
        int arr1[] = new int[s1];
        prog_38 obj = new prog_38(arr1, s1);
        obj.getElement();
        obj.nxtgrtele();

    }
}

// 38)Java Program to Print Next Greater Element in Array
