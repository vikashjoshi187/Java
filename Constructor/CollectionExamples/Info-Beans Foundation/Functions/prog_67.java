import java.util.Scanner;
public class prog_67 {
	//  *  #  *  #  *  #  *  .....

	static String check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Series  ");
		int size = sc.nextInt();
		String a = " ";
		for (int i = 1; i <= size; i++) {
			if (i % 2 == 0)
				a += "#  ";
			else
				a += "*  ";
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.print(check());
	}
}