import java.util.Scanner;
class Prog8 {
	void Pattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number of row -> ");
		int row = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0)
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Prog8 obj = new Prog8();
		obj.Pattern();
	}
}