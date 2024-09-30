import java.util.Scanner;
public class prog_31 {
	/*
*
**
***
****
*****
	 */
	String Pattern(int rows) {
		String pattern = "";
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				pattern += "*";
			}
			pattern += "\n";
		}
		return pattern;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Row ");
		int rows = sc.nextInt();
		prog_31 obj = new prog_31();
		System.out.println(obj.Pattern(rows));
	}
}