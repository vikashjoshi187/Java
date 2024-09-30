import java.util.Scanner;
public class prog_68 {
	//68)WAP to transpose 2D array
    static Scanner sc = new Scanner(System.in);
    int arr[][],col,row;

    prog_68(int arr[][],int row, int col) {
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

    void transpose() {
        int arr1[][] = new int [col][row];
		for (int i = 0; i < row; i++){
			for (int j = 0; j < col; j++) {
				arr1[j][i] = arr[i][j];
			}
		}
		System.out.println("\nTranspose Of Matrix ");
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows of Array ");
		int row = sc.nextInt();
		System.out.print("Enter Columns of Array ");
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
        prog_68 obj = new prog_68(arr,row,col);
        obj.getElement();
        obj.show();
        obj.transpose();
	}
}