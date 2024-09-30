import java.util.Scanner;
public class prog_64 {
    // 59)WAP to find out the sum of all the elements of 2D array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int r = sc.nextInt();
        System.out.println("Enter number of columns");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elenets in row " + (i + 1));
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("the 2d array is -");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elenets in row " + (i + 1));
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println();
        }
        System.out.println("the sum of all the integer in the 2D array is " + sum);
    }
}