import java.util.Scanner;
public class prog_62{
	//  1       8       27       64      125  ......

	static String check(int size) {
		String series = " ";
		for (int i = 1; i <= size; i++){
			series += (i * i * i) + "\t";
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