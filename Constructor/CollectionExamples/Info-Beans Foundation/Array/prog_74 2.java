

import java.util.Scanner;
public class prog_74 {
        // 69)WAP to check whether entered 2D array is a unit or ID matrix or not

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
			System.out.print("Enter Rows of Array -> ");
			int row = sc.nextInt();
			System.out.print("Enter Columns of Array ->");
			int col = sc.nextInt();
			int arr[][] = new int[row][col];
			System.out.println("Enter the elements for array ->");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println("Array Elements Are ->");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			boolean identity = true;
			for (int i = 0; i < row; i++) {
					if (arr[i][i] != 1){
						identity = false;
						break;
					}
				for (int j = 0; j < col; j++) {
					if (i != j && arr[i][j] != 0){
						identity = false;
						break;
					}
				}
			}
			if (identity)
				System.out.println("The matrix is an identity matrix.");
			else
				System.out.println("The matrix is not an identity matrix.");
		
        }
        
    }
    