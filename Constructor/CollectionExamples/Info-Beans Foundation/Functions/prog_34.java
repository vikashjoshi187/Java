import java.util.Scanner;
public class prog_34 {
	/*
1
123
12345
1234567
123456789
	 */
	String Pattern(int row) {
		String pattern = "";
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i * 2 - 1; j++) {
				pattern += "" + j;
			}
			pattern += "\n";
		}
		return pattern;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Row ");
		int row = sc.nextInt();
		prog_34 obj = new prog_34();
		System.out.println(obj.Pattern(row));
	}
}