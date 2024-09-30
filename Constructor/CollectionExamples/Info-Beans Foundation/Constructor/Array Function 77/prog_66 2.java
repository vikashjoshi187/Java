import java.util.Scanner;
public class prog_66 {
	//66)WAP to find out the sum of LR and RL diagonal elements ignoring the repeated center term

    static Scanner sc = new Scanner(System.in);
    int arr[][],col,row;

    prog_66(int arr[][],int row, int col) {
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

    void LR_RLaddition() {
        int sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == j || (i + j == col - 1))
					sum += arr[i][j];
			}
		}
		System.out.println("Sum of all Elements At LR & RL Diagonal " + sum);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows of Array ");
		int row = sc.nextInt();
		System.out.print("Enter Columns of Array ");
		int col = sc.nextInt();
        if (row == col) {
		    int arr[][] = new int[row][col];
            prog_66 obj = new prog_66(arr,row,col);
            obj.getElement();
            obj.show();
            obj.LR_RLaddition();
        } else
            System.out.println("Addition Is Not Possible.");
	}
}