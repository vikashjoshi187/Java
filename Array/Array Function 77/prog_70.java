import java.util.Scanner;
public class prog_70 {
    //70)WAP to check whether entered array is upper triangular matrix or not
    static Scanner sc = new Scanner(System.in);
    int arr[][],col,row;

    prog_70(int arr[][],int row, int col) {
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
        System.out.println("Array Elements Are ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + "\t");
			}System.out.println();
		}
    }

    void identity() {
        int count = 0;
			for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (j < i && arr[i][j] != 0) {
                        count++;
                        break;
                    }
                }
            }
			if (count == 0)
				System.out.println("Array is Upper Triangular Matrix ");
			else
				System.out.println("Array is Not a Upper Triangular Matrix ");
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows of Array ");
		int row = sc.nextInt();
		System.out.print("Enter Columns of Array ");
		int col = sc.nextInt();
        if (row == col) {
		    int arr[][] = new int[row][col];
            prog_70 obj = new prog_70(arr,row,col);
            obj.getElement();
            obj.show();
            obj.identity();
        } else
			System.out.println("Identity Matrix is Not Possible");
	}
}