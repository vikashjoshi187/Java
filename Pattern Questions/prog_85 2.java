import java.util.Scanner;
public class prog_85 {
    /*
*********
**     **
* *   * *
*  * *  *
*   *   *
*  * *  *
* *   * *
**     **
*********
     */
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter num");
    int num=sc.nextInt();

    for (int i = 1; i <= (num*2)-1; i++) {
        for (int j = 1; j <= (num*2)-1; j++) {
          if (i == (num*2)-1 || i == 1 || j == 1 || j == (num*2)-1 || i==j || j==(num*2-i)) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    
}    
}
