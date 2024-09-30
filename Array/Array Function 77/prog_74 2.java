import java.util.Scanner;

public class prog_74 {
//74)WAP to multiply two 2D array
    int arr[][], arr1[][], r, c, r1, c1;
    Scanner sc = new Scanner(System.in);

	prog_74(int arr[][], int arr1[][], int r, int c, int r1, int c1) {
		this.arr = arr;
		this.arr1 = arr1;
		this.r = r;
		this.c = c;
		this.r1 = r1;
		this.c1 = c1;
	}
    
	void getElement1() {
		System.out.println("Enter Elements of 1st Matrix ->");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}

	void getElement2() {
		System.out.println("Enter Elements of 2nd Matrix ->");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
	}

	void show() {
		System.out.println("1st Matrix  ->");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("2nd Matrix  ->");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
	}

	int[][] multiply() {
		int arr2[][] = new int[r][c1];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c1; j++) {
				arr2[i][j] = 0;
				for (int k = 0; k < c; k++) {
					arr2[i][j] += arr[i][k] * arr1[k][j];
				}
			}
		}
		return arr2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Row & Column of First Matrix ->");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int [r][c];
		System.out.println("Row & Column of Second Matrix ->");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int arr1[][] = new int [r1][c1];
		if (c == r1) {
			prog_74 obj = new prog_74(arr, arr1, r, c, r1, c1);
			obj.getElement1();
			obj.getElement2();
			obj.show();
			int arr2[][] = obj.multiply();
			System.out.println("Multiplication of Both Matrix  ->");
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c1; j++) {
					System.out.print(arr2[i][j] + "\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("Please Enter Same Column of 1st Matrix & Row of 2nd Matrix");
		}
    }
}