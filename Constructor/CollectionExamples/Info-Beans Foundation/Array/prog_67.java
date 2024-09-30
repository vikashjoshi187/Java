import java.util.Scanner;

public class prog_67 {
    // 62)WAP to find out the sum of LR diagonal elements

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
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
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (j == i) {
                    if (arr[i][j] == 0) {
                        count++;
                    }

                }

            }
            System.out.println();
        }


        if (count==arr.length) {
            System.out.println("it is l digonal matrix");

            
        }

    }

}
