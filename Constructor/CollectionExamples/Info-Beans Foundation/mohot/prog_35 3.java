import java.util.Scanner;
class Prog5 {
	void pattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number of row -> ");
		int row = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int sp = row; sp >= 1; sp--) {
				if (sp >= i)
					System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("" + j);
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Prog5 obj = new Prog5();
		obj.pattern();
	}
}