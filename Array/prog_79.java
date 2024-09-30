import java.util.Scanner;

public class prog_79 {
    // 74)WAP to multiply two 2D array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter r1");
        int r1 = sc.nextInt();
        System.out.println("Enter c1");
        int c1 = sc.nextInt();
        int arr1[][] = new int[r1][c1];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter r2");
        int r2 = sc.nextInt();
        System.out.println("Enter c2");
        int c2 = sc.nextInt();
        int arr2[][] = new int[r2][c2];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int arr3[][] = new int[r1][c2];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                for (int k = 0; k < c1; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }

            }
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                System.out.print("\t" + arr3[i][j]);

            }
            System.out.println();
        }

    }
}