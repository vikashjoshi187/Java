import java.util.Scanner;

public class prog_68 {
    // 63)WAP to count even and odd elements in a 2D array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];

        System.out.println("Entet the elements in 2d array");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elements in row" + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        int od = 0, ev = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    ev++;

                } else {
                    od++;
                }
            }
        }

        System.out.println("The number od even elements are " + ev + "\nThe number of odd elements are " + od);
    }

}
