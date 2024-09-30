import java.util.Scanner;
class prog_35 {
	/*
	  1
     123
    12345
   1234567
  123456789
	 */
	void pattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number of row ");
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
		prog_35 obj = new prog_35();
		obj.pattern();
	}
}