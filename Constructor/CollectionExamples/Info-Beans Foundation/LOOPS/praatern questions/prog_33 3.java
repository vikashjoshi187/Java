import java.util.Scanner;
public class prog_33 {
    /*
      *
     * *
    *   *
   *     *
  *       *
 * * * * * *
*/
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
for (int i = 1; i <= num; i++) {
    for (int sp= 1; sp <= num-i; sp++) {
        System.out.print(" ");
        
    }
    for (int j = 1; j <=i ; j++) {
        if(j==i || i==num || j==1)
        {
            System.out.print("* ");
        }
        else{
            System.out.print("  ");
        }
        
    }
    System.out.println();
    
}

}    
}
