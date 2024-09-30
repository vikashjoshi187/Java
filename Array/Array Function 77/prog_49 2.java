import java.util.Scanner;

public class prog_49 {
    // 49) WAP to compare two array
    static Scanner sc = new Scanner(System.in);
    int arr1[], arr2[], s1, s2;

    prog_49(int arr1[], int s1, int arr2[], int s2) {
        this.arr1 = arr1;
        this.s1 = s1;

        this.arr2 = arr2;
        this.s2 = s2;

    }

    void getElement() {
        System.out.println("Enter the Array Elements in array 1");
        for (int i = 0; i < s1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the Array Elements in array 2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

    }

    void compareArr() {

        if (s1 == s2) {
            int count = 0;
            for (int i = 0; i < s1; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("The array are not same");
                    break;
                }
                count++;

            }
            if (count == s1) {
                System.out.println("The array are same");
            }
        }

        else {
            System.out.println("the Arrya are not same");
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of Array 1");
        int s1 = sc.nextInt();
        System.out.println("Enter the Size of Array 2");
        int s2 = sc.nextInt();

        int arr1[] = new int[s1 + s2];
        int arr2[] = new int[s2];
        prog_49 obj = new prog_49(arr1, s1, arr2, s2);
        obj.getElement();
        obj.compareArr();

    }
}
