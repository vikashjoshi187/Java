import java.util.Scanner;
class prog_63 {
	//63)WAP to count even and odd elements in a 2D array

    static Scanner sc = new Scanner(System.in);
    int arr[][],col,row;

    prog_63(int arr[][],int row, int col) {
        this.arr = arr;
        this.row = row;
        this.col = col;
    }

    void getElement() {
        System.out.println("Enter the elements for array ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
    }

    void show() {
        System.out.println("Enter the elements for array ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + "\t");
			}System.out.println();
		}
    }

    void evenOdd() {
        int even = 0,odd =0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] % 2 == 0)
					even++;
				else
				    odd++;
			}
		}
		System.out.println("\nTotal Even Elements of Array Are   " + even);
		System.out.println("Total Odd Elements of Array Are  -" + odd);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows of Array ");
		int row = sc.nextInt();
		System.out.print("Enter Columns of Array ");
		int col = sc.nextInt();
        if (row == col) {
		int arr[][] = new int[row][col];
        prog_63 obj = new prog_63(arr,row,col);
        obj.getElement();
        obj.show();
        obj.evenOdd();
        } else
			System.out.println("Addition Is Not Possible.");
	}
}