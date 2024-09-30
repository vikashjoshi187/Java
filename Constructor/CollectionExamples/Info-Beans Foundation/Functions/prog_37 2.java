import java.util.Scanner;
public class prog_37 {
	String Pattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number of row ");
		int row = sc.nextInt();
		String pattern = "";
		for (int i = 65; i <= row + 65; i++) {
			for (int j = 65; j <= i; j++) {
				pattern += "" + (char)j;
			}
			pattern += "\n";
		}
		return pattern;
	}
	public static void main(String[] args) {
		prog_37 obj = new prog_37();
		String Pattern = obj.Pattern();
		System.out.print(Pattern);
	}
}