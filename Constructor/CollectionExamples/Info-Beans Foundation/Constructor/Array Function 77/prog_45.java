import java.util.Scanner;

public class prog_45 {
    // 45) WAP to check prime numbers in an array
    static Scanner sc = new Scanner(System.in);
    int arr1[], s1;

    prog_45(int arr1[], int s1) {
        this.arr1 = arr1;
        this.s1 = s1;

    }

    void getElement() {
        System.out.println("Enter the Array Elements in array 1");
        for (int i = 0; i < s1; i++) {
            arr1[i] = sc.nextInt();
        }

    }

    void printPrime() {
        for (int i = 0; i < arr1.length; i++) {
            int count = 0;
            for (int j = 1; j <= arr1[i] / 2; j++) {
                if (arr1[i] % j == 0) {
                    count++;
                }
            }
            if (count == 1)
                System.out.println(arr1[i] + " Prime Number ");
            else
                System.out.println(arr1[i] + " Not Prime Number");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of Array 1");
        int s1 = sc.nextInt();

        int arr1[] = new int[s1];

        prog_45 obj = new prog_45(arr1, s1);
        obj.getElement();
        obj.printPrime();

    }
}
