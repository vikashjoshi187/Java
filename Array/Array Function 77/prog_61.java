import java.util.Scanner;
public class prog_61 {
	//61)WAP to find out the sum of specific column entered by the user

    static Scanner sc = new Scanner(System.in);
    int arr[][],col,row;

    prog_61(int arr[][],int row, int col) {
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

    void colSum() {
        System.out.println("Enter Column Of Array At Which You Want Sum ");
		int col1 = sc.nextInt(),sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (j == (col1-1))
				sum += arr[i][j];
			}
		}
		System.out.println("Sum of all Elements of "+col1+" Column  " + sum);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows of Array ");
		int row = sc.nextInt();
		System.out.print("Enter Columns of Array ");
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
        prog_61 obj = new prog_61(arr,row,col);
        obj.getElement();
        obj.colSum();
	}
}