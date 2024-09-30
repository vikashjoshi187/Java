import java.util.Scanner;
 class prog_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int row = sc.nextInt();
        int arr[][] = new int[row][];
        for (int i = 0; i < row; i++) {
            System.out.println("Enter coloumns");
            int col = sc.nextInt();
            arr[i] = new int[col];
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println("anter elements for row " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println("array elements are");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }

    }
}