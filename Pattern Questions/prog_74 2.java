import java.util.Scanner;
public class prog_74 {
    /*
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
*/
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
for (int i = num; i >= 1; i--) {
    for (int j = 1; j <= num; j++) {
        if (j<=num-i) {
            System.out.print(" ");
            
        }
        else{
            System.out.print("* ");
        }
        
        
    }
    System.out.println();
    
}

}    
}
