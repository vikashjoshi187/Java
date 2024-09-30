import java.util.Scanner;
class prog_60{
	// 0  7  14  21  28  ...........

	static String check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Series  ");
		int size = sc.nextInt();
		String series = " ";
		for (int i = 0; i < size; i++ ){
			series += (i * 7) + "\t";
		}
		return series;
	}
	
	public static void main(String[] args) {
	System.out.print(check());
	}
}