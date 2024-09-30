import java.util.Scanner;
public class prog_73 {
    // 68)WAP to transpose 2D array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of array");
        int row = sc.nextInt();
        System.out.println("Enter the column of array");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the elements in the array ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("The normal array is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("The trans posed array is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }
}
