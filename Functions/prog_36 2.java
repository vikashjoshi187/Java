import java.util.Scanner;
public class prog_36 {
	String Pattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number of row  ");
		int row = sc.nextInt();
		String pattern = "";
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				pattern += "" + j;
			}
			pattern += "\n";
		}
		return pattern;
	}
	public static void main(String[] args) {
		prog_36 obj = new prog_36();
		String Pattern = obj.Pattern();
		System.out.print(Pattern);
	}
}