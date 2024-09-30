import java.util.Scanner;

class prog_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number of row in matrix 1 -> ");
        int row = sc.nextInt();
        System.out.println(" Enter number of columns in matrix 1 -> ");
        int col = sc.nextInt();
        System.out.println(" Enter number of row in matrix 2 -> ");
        int row1 = sc.nextInt();
        System.out.println(" Enter number of columns in matrix 2 -> ");
        int col1 = sc.nextInt();

        int arr[][] = new int[row][col];
        int arr1[][] = new int[row1][col1];
        int arr2[][] = new int[row][col1];

        if (col == row1) {
            System.out.println(" Enter the array element 1 : ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println(" Enter the array element 2 : ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Matrix-1 ->");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("Matrix-2 ->");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.print(arr1[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("\nMatrix after multiplication : ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col1; j++) {
                    // arr2[i][j] = 0;
                    for (int k = 0; k < col; k++) {
                        arr2[i][j] = arr2[i][j] + arr[i][k] * arr1[k][j];
                    }
                    System.out.print(arr2[i][j] + "\t");
                }
                System.out.println();
            }
        } else
            System.out.println(" Multiplication is not posiible");
    }
}