import java.util.Scanner;
public class prog_57 {
	//1       2       4       7       11      16.....

	static void check(int size) {
		int temp = 1, temp1 = 0;
		for (int i = 1; i <= size; i++ ){
			temp += temp1++;
			System.out.print(temp+"\t");
		}System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Series ");
		int size = sc.nextInt();
		check(size);
	}
}