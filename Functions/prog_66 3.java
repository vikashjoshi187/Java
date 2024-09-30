import java.util.Scanner;
public class prog_66 {
	//  0      8      64     216  .....

	static void check(int size) {
		for (int i = 0; i < size; i++){
			int a = (i * 2);
			System.out.print((a * a * a) + "\t");
		}System.out.println();
	}

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Series  ");
		int size = sc.nextInt();
	   check(size);
	}
}