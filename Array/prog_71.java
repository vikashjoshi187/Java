import java.util.Scanner;

public class prog_71 {
    // 67)WAP to find out the sum of all the boundary elements.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];

        System.out.println("Enter the elements in 2d array");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elements in row" + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

        System.out.println("THe matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || j == 0 || i == arr.length - 1 || j == arr.length - 1) {

                    sum = sum + arr[i][j];
                } else {

                }
            }
        }
        System.out.println("The sum of all border lements is " + sum);

    }

}
