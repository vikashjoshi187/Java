import java.util.Scanner;
class prog_63 {
	//  1      9      25     49      81   ......

	static String check(int size) {
		String series = " ";
		for (int i = 1; i <= size; i++){
			int a = (i * 2) - 1;
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