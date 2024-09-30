import java.util.Scanner;
public class prog_64 {
	//  0     4     16     36     64 .....

	static String check(int size) {
		String series = " ";
		for (int i = 0; i < size; i++){
			int a = (i * 2);
			series += (a * a) + "\t";
		}
		return series;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Series ");
		int size = sc.nextInt();
	    System.out.print(check(size));
	}
}