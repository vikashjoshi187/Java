import java.util.Scanner;
class Prog10 {
	void Pattern(int row) {
		for (int i = 1; i <= row * 2 - 1; i++) {
			for (int j = 1; j <= row * 2 - 1; j++) {
				if (i == 1 || j == 1 || j == row * 2 - 1 || i == row * 2 - 1 || i == j || i == row * 2 - j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number of row -> ");
		int row = sc.nextInt();
		Prog10 obj = new Prog10();
		obj.Pattern(row);
	}
}