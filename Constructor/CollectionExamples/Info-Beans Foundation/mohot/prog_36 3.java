import java.util.Scanner;
class Prog6 {
	String Pattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number of row -> ");
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
		Prog6 obj = new Prog6();
		String Pattern = obj.Pattern();
		System.out.print(Pattern);
	}
}