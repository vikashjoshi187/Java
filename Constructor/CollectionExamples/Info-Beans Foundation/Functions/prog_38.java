import java.util.Scanner;
public class prog_38 {
	void Pattern() {
		/*
*
##
***
####
*****
######
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number of row  ");
		int row = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0)
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		prog_38 obj = new prog_38();
		obj.Pattern();
	}
}