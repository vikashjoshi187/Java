import java.util.Scanner;
public class prog_66 {
    /*
     *
    ***
   *****
  *******
 *********
***********
*/
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();

for (int i = 1; i <= num; i++) {
    for (int sp = 1; sp <= num-i; sp++) {
        System.out.print(" ");
        
    }
    
    for (int j = 1; j <= (i*2)-1; j++) {
        System.out.print("*");
    }
    
    System.out.println();
    
}

}    
}
