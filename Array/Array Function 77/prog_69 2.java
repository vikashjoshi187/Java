import java.util.Scanner;
public class prog_69 {
	//69)WAP to check whether entered 2D array is a unit or Identity matrix or not

    static Scanner sc = new Scanner(System.in);
    int arr[][],col,row;

    prog_69(int arr[][],int row, int col) {
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

    void identity() {
        boolean identity = true;
			for (int i = 0; i < row; i++) {
				if (arr[i][i] != 1) {
					identity = false;
					break;
				}
				for (int j = 0; j < col; j++) {
					if (i != j && arr[i][j] != 0) {
						identity = false;
						break;
					}
				}
			}
			if (identity)
				System.out.println("The Matrix is an identity matrix ");
			else
				System.out.println("The Matrix is not an identity matrix ");
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows of Array ");
		int row = sc.nextInt();
		System.out.print("Enter Columns of Array ");
		int col = sc.nextInt();
        if (row == col) {
		    int arr[][] = new int[row][col];
            prog_69 obj = new prog_69(arr,row,col);
            obj.getElement();
            obj.show();
            obj.identity();
        } else
			System.out.println("Identity Matrix is Not Possible.");
	}
}