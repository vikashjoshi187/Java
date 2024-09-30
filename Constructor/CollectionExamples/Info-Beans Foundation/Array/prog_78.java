import java.util.Scanner;

public class prog_78 {
    // 73)WAP to asub two 2D array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row for array 1");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of column for array 1");
        int c1 = sc.nextInt();

        System.out.println("Enter the number of row for array 2");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of column for array 2");
        int c2 = sc.nextInt();

        if (r1 == r2 && c2 == c1) {
            int arr1[][] = new int[r1][c1];
            System.out.println("Enter elements for array 1");
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    arr1[i][j] = sc.nextInt();

                }

            }
            int arr2[][] = new int[r2][c2];
            System.out.println("Enter elements for array 2");
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    arr2[i][j] = sc.nextInt();

                }

            }
            int aar3[][] = new int[r1][c1];
            for (int i = 0; i < aar3.length; i++) {
                for (int j = 0; j < aar3.length; j++) {
                    aar3[i][j] = arr1[i][j] - arr2[i][j];

                }
            }

            System.out.println("The subtraction of arrys is ");
            for (int i = 0; i < aar3.length; i++) {
                for (int j = 0; j < aar3[i].length; j++) {
                    System.out.print(aar3[i][j] + " ");
                }
                System.out.println();
            }

        }

    }

}
