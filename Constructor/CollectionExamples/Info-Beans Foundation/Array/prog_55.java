import java.util.Scanner;

public class prog_55 {
    // 50) Java Program For Sorting An Array Of 0s, 1s and 2s

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the siz if array");
        int s = sc.nextInt();

        int arr[] = new int[s];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int k = 2; k >= 0; k--) {

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j + 1] == k) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);

        }
    }

}
