
import java.util.Scanner;

public class prog_75 {
    // 70)WAP to check whether entered array is upper triangular matrix or not

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];

        if (row == col) {

            System.out.println("Entet the elements in 2d array");
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter elements in row " + (i + 1));
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = sc.nextInt();

                }
            }

            System.out.println("The matrix is ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");

                }
                System.out.println();
            }
            int count = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (j < i && arr[i][j] != 0) {
                        count++;
                        break;
                    }
                }
            }
            if (count == 0)
                System.out.print(" upper triangular matrix ");
            else
                System.out.print("Not a upper triangular matrix ");

        } else {
            System.out.println("Row and col not same");
        }

    }

}
