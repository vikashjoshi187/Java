import java.util.Scanner;
class prog_61{
	//  1      4       9       16      25  ......

	static String check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Series ");
		int size = sc.nextInt();
		String series = " ";
		for (int i = 1; i <= size; i++){
			series += (i * i) + "\t";
		}
		return series;
	}

	public static void main(String[] args) {
	System.out.print(check());
	}
}