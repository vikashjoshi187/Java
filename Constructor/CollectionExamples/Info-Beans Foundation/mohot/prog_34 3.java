import java.util.Scanner;
class Prog4 {
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
		System.out.println("Enter Number of Row -> ");
		int row = sc.nextInt();
		Prog4 obj = new Prog4();
		System.out.println(obj.Pattern(row));
	}
}