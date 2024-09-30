import java.util.Scanner;
public class prog_50 {
    //50) Java Program For Sorting An Array Of 0s, 1s and 2s
    static Scanner sc = new Scanner(System.in);
    int arr1[], s1;

    prog_50(int arr1[], int s1) {
        this.arr1 = arr1;
        this.s1 = s1;

    }

    void getElement() {
        System.out.println("Enter the Array Elements in array 1");
        for (int i = 0; i < s1; i++) {
            arr1[i] = sc.nextInt();
        }

    }

    void sort012() {
        for (int k = 2; k >= 0; k--) {

            for (int i = 0; i < arr1.length - 1; i++) {
                for (int j = 0; j < arr1.length - 1; j++) {
                    if (arr1[j + 1] == k) {
                        int temp = arr1[j];
                        arr1[j] = arr1[j + 1];
                        arr1[j + 1] = temp;
                    }
                }
            }
        }
        
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("\t" + arr1[i]);

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of Array 1");
        int s1 = sc.nextInt();

        int arr1[] = new int[s1];

        prog_50 obj = new prog_50(arr1, s1);
        obj.getElement();
        obj.sort012();


    }
}


