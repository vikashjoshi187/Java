import java.util.Scanner;
public class prog_41 {
	/*
	  1      
     12     
    123    
   1234   
  12345  
 123456 
1234567
	 */
	void Pattern(int row) {
		for (int i = 1; i <= row; i++) {
			for (int sp = row; sp > i; sp--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= row; j++) {
				if (j <= i)
					System.out.print("" + j);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number of row  ");
		int row = sc.nextInt();
		prog_41 obj = new prog_41();
		obj.Pattern(row);
	}
}