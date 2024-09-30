import java.util.Scanner;
class Prog13 {
	String Pattern(int row) {
		String pattern = "";
		for (int i = 1; i <= (row / 2) + 1; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i)
					pattern += "" + (j);
				else
					pattern += " ";
			}
			pattern += "\n";
		}
		for (int i = (row / 2); i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i)
					pattern += "" + (j);
				else
					pattern += " ";
			}
			pattern += "\n";
		}
		return pattern;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number of row -> ");
		int row = sc.nextInt();
		Prog13 obj = new Prog13();
		System.out.println(obj.Pattern(row));
	}
}