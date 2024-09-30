import java.util.Scanner;
class Prog12 {
	void Pattern(int row) {
		for (int i = 1; i <= row / 2 + 1; i++) {
			for (int sp = 1; sp < row - i - 1; sp++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = row / 2; i >= 1; i--) {
			for (int sp = 1; sp < row - i - 1; sp++) {
				System.out.print(" ");
			}
			for (int j = i * 2 - 1; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number of row -> ");
		int row = sc.nextInt();
		Prog12 obj = new Prog12();
		obj.Pattern(row);
	}
}