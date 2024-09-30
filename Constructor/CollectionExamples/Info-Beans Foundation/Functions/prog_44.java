import java.util.Scanner;
public class prog_44 {
	/*
*       *
**     **
***   ***
**** ****
*********
	 */
	String Pattern(int row) {
		String pattern = "";
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j < row * 2; j++) {
				if (j <= i || j >= row * 2 - i)
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
		System.out.println(" Enter Number of row  ");
		int row = sc.nextInt();
		prog_44 obj = new prog_44();
		System.out.println(obj.Pattern(row));
	}
}