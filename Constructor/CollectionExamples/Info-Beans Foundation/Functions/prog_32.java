import java.util.Scanner;
public class prog_32 {
	/*
*
**
* *
*  *
*****
	 */
	String Pattern(int rows) {
		String pattern = "";
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == rows)
					pattern += "*";
				else
					pattern += " ";
			}
			pattern += "\n";
		}
		return pattern;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Row ");
		int rows = sc.nextInt();
		prog_32 obj = new prog_32();
		System.out.println(obj.Pattern(rows));
	}
}