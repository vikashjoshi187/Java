import java.util.Scanner;
public class prog_59 {
	//59)WAP to find out the sum of all the elements of 2D array

    static Scanner sc = new Scanner(System.in);
    int arr[][],col,row;

    prog_59(int arr[][],int row, int col) {
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

    void sumAll() {
        int sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("Sum of all Elements " + sum);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows of Array");
		int row = sc.nextInt();
		System.out.print("Enter Columns of Array");
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
        prog_59 obj = new prog_59(arr,row,col);
        obj.getElement();
		obj.show();
        obj.sumAll();
	}
}