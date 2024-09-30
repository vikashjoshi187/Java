import java.util.Scanner;
public class prog_58 {
	// 1      2      2      4      8 .....

	static void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Series ");
		int size = sc.nextInt();
		double temp = 0.5;
		double temp1 = 2;
		for (int i = 1; i <= size; i++ ){
			double a = temp *temp1;
			System.out.print((int)a+"\t");
			temp = temp1;
			temp1 = a;
		}System.out.println();
	}
	
	public static void main(String[] args) {
		check();
	}
}