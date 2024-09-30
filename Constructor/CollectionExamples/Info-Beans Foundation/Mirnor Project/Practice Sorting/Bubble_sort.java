import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("aenter size of array");
        int s = sc.nextInt();

        int arr[] = new int[s];

        System.out.println("Enter arry elemnts");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }

    }

}
