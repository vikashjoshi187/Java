import java.util.Scanner;
public class prog_39 {
	/*
*             *
 *           * 
  *         *  
   *       *   
    *     *    
     *   *     
      * *      
       *       
      * *      
     *   *     
    *     *    
   *       *   
  *         *  
 *           * 
*             *
	 */
	void Pattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number of row ");
		int row = sc.nextInt();
		for (int i = 1; i <= row * 2 - 1; i++) {
			for (int j = 1; j <= row * 2 - 1; j++) {
				if (i == j || i == row * 2 - j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		prog_39 obj = new prog_39();
		obj.Pattern();
	}
}