import java.util.Scanner;
public class prog_34 {
    /*
      *
     * *
    * * *
   * * * *
  * * * * *
 * * * * * *
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
for (int i = 1; i <= (num/2)+1; i++) {
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
for (int i = (num/2); i >=1 ; i--) {
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
