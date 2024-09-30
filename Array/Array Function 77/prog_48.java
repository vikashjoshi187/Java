import java.util.Scanner;
public class prog_48 {
    //48) WAP to split an array and add the first half after the second half of the array
    static Scanner sc = new Scanner(System.in);
    int arr1[], s1;

    prog_48(int arr1[], int s1) {
        this.arr1 = arr1;
        this.s1 = s1;

    }

    void getElement() {
        System.out.println("Enter the Array Elements in array 1");
        for (int i = 0; i < s1; i++) {
            arr1[i] = sc.nextInt();
        }

    }

    void adjEleswp() {
        // Taking input for the position to split the array
        System.out.print("Enter the position to split the array: ");
        int pos = sc.nextInt();

        for (int i = 0; i < pos; i++) {

            int temp = arr1[0];
            for (int j = 0; j < arr1.length - 1; j++) {
                arr1[j] = arr1[j + 1];

            }
            arr1[arr1.length - 1] = temp;

        }
        System.out.println("The modified array is: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of Array 1");
        int s1 = sc.nextInt();

        int arr1[] = new int[s1];

        prog_48 obj = new prog_48(arr1, s1);
        obj.getElement();
        obj.adjEleswp();


    }
}

