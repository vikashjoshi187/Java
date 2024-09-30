import java.util.Scanner;
class prog_67 {
    //67)WAP to find out the sum of all the boundary elements.

    static Scanner sc = new Scanner(System.in);
    int arr[][],col,row;

    prog_67(int arr[][],int row, int col) {
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

    void boundaryElement() {
        System.out.println("Sum of all Elements of RL Diagonal " + (arr[0][0]+arr[row-1][0]+arr[0][col-1]+arr[row-1][col-1]));
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows of Array ");
		int row = sc.nextInt();
		System.out.print("Enter Columns of Array ");
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
        prog_67 obj = new prog_67(arr,row,col);
        obj.getElement();
        obj.show();
        obj.boundaryElement();
	}
}