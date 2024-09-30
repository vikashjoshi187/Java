import java.util.Scanner;
public class  prog_72 {
    //72)WAP to add two 2D array

    static Scanner sc = new Scanner(System.in);
    int arr1[][], arr2[][], r, c, r1, c1;
     prog_72(int arr1[][], int arr2[][], int r, int c, int r1, int c1) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.r = r;
        this.c = c;
        this.r1 = r1;
        this.c1 = c1;
    }

    void getElement() {
        System.out.println("Enter First Array Elements  ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Second Array Elements  ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
    }


    void show() {
        System.out.println("Matrix 1 is  ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix 2 is -> ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void addition() {
         int arr3[][] = new int[r][c];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of Both Matrix -> ");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String atrgs[]) {
        System.out.println("Enter Rows and Columns of First Matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter Rows and Columns of Second Matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        
        if (r == r1 && c == c1) {
            int arr1[][] = new int[r][c];
            int arr2[][] = new int[r][c];
            prog_72 obj = new  prog_72(arr1, arr2, r, c, r1, c1);
            obj.getElement();      
            obj.show();
            obj.addition();
        } else {
            System.out.println("Addition is Not Possible");
        }
    }
}