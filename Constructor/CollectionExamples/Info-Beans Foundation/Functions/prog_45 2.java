import java.util.Scanner;
public class prog_45 {
	/*
*********
**** ****
***   ***
**     **
*       *
*       *
**     **
***   ***
**** ****
*********
	 */
	String Pattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number of row  ");
		int row = sc.nextInt();
		String pattern = "";
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j < row * 2; j++) {
				if (j <= i || j >= row * 2 - i)
					pattern += "*";
				else
					pattern += " ";
			}
			pattern += "\n";
		}
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
		prog_45 obj = new prog_45();
		System.out.println(obj.Pattern());
	}
}