import java.util.Scanner;
public class prog_70 {
	//  1 + 11 + 111 + 1111 + 11111 .....

	static void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Series  ");
		int size = sc.nextInt();
		int a = 0, sum = 0;
		for (int i = 1; i <= size; i++){
			a = (10 * a) + 1;
			sum += a;
		}
		System.out.print("Sum -> " + sum);
	}

	public static void main(String[] args) {
	   check();
	}
}