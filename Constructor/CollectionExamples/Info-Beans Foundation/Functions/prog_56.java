import java.util.Scanner;
public class prog_56 {
	// ....   -3      0       3       6       9   ....
	
	static void check(int num, int size) {
		for (int i = 1; i <= size; i++ ){
			System.out.print(num+"\t");
			num += 3;
		}System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number ");
		int num = sc.nextInt();
		System.out.println("Enter Size of Series ");
		int size = sc.nextInt();
		check(num, size);
	}
}