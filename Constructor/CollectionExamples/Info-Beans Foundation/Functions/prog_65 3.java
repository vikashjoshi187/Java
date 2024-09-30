import java.util.Scanner;
public class prog_65 {
	//  1      27     125     343  .....

	static void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Series ");
		int size = sc.nextInt();
		for (int i = 1; i <= size; i++){
			int a = (i * 2) - 1;
			System.out.print((a * a * a) + "\t");
		}System.out.println();
	}

	public static void main(String[] args) {
	   check();
	}
}