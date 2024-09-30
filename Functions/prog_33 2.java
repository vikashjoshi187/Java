import java.util.Scanner;
public class prog_33 {
	/*
 1234567
  1+++5
   1+3
    1
	 */
	void pattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number of row  ");
		int row = sc.nextInt();
		for (int i = row; i >= 1; i--) {
			for (int sp = 1; sp <= row; sp++) {
				if (sp >= i)
					System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				if (j == 1 || i == row || j == i * 2 - 1)
					System.out.print("" + j);
				else
					System.out.print("+");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		prog_33 obj = new prog_33();
		obj.pattern();
	}
}