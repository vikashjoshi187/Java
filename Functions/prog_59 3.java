import java.util.Scanner;
public class prog_59 {
	// 1+1/2+1/3+1/4+1/5............n

	static void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Series  ");
		int size = sc.nextInt();
		double sum = 0;
		for (int i = 1; i <= size; i++ ){
			sum += 1.0/i;
		}
		System.out.print(sum+"\t");
	}
	
	public static void main(String[] args) {
		check();
	}
}