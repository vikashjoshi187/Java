import java.util.Scanner;

public class prog_33 {
    // Addition and Multiplication of two 2d array
    int arr1[][], arr2[][], r, c, r1, c1, arr3[][];

    void setData(int arr1[][], int arr2[][], int arr3[][], int r, int c, int r1, int c1) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.arr3 = arr3;
        this.r = r;
        this.c = c;
        this.r1 = r1;
        this.c1 = c1;
    }

    int[][] addition() {
        System.out.println("Matrix  1 is");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix  2 is");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum is");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }
        return arr3;
    }

    void Multiplication() {
        System.out.println("Matrix 1 is");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("Matrix 2 is");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
        /* main logic of multiplication */
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c1; j++) {
                arr3[i][j] = 0;
                for (int k = 0; k < c; k++) {
                    arr3[i][j] = arr3[i][j] + arr1[i][j] * arr2[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Multiplication  is");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String atrgs[]) {
        Scanner sc = new Scanner(System.in);
        prog_33 obj = new prog_33();
        System.out.println("Enter rows and colums of first matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter rows and colums of second matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        /* addiotin logic */
        int sum = 0;
        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][c];
        int arr3[][] = new int[r][c];
        System.out.println("Enter first array element");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second array element");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        obj.setData(arr1, arr2, arr3, r, c, r1, c1);
        if (r == c) {
            System.out.println("The addition of matrix is : ");
            obj.addition();
        } else {
            System.out.println("Plz enter equal row and column for addition");
        }
        /* multiplication logic */
        if (c == c1) {
            obj.Multiplication();
        } else {
            System.out.println("Multiplicarion og matrix is not possibal");
        }

    }
}
