
import java. util.Scanner;
public class prog_80 {
        //76)WAP showing the concept of jagged array by taking inputs from user

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row ");
        int r = sc.nextInt();
        int arr[][] = new int[r][];

        for (int j = 0; j < arr.length; j++) {
            System.out.println("enter col for row " + (j+1));
            int col = sc.nextInt();
            arr[j] = new int[col];
            
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter element for row "+(i+1));
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();

            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();

        }

    }
}
