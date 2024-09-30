import java.util.Scanner;
public class prog_60 {
	//60)WAP to find out the sum of specific row entered by the user
    static Scanner sc = new Scanner(System.in);
    int arr[][],col,row;

    prog_60(int arr[][],int row, int col) {
        this.arr = arr;
        this.row = row;
        this.col = col;
    }

    void getElement() {
        System.out.println("Enter the elements for array  ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
    }

    void rowSum() {
        System.out.println("Enter Row In Which You Want Sum");
		int row1 = sc.nextInt(),sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == (row1-1))
				sum += arr[i][j];
			}
		}
		System.out.println("Sum of all Elements of Row -> " + sum);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows of Array ->");
		int row = sc.nextInt();
		System.out.print("Enter Columns of Array ->");
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
        prog_60 obj = new prog_60(arr,row,col);
        obj.getElement();
        obj.rowSum();
	}
}