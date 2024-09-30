import java.util.Scanner;
public class prog_52 {
    /*
    A
   AB
  ABC
 ABCD
ABCDE
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for (int i = 1; i <=num; i++) {
            int temp=65;
            for (int j = num; j >=1; j--) {
              
              if (i>=j) {
                System.out.print((char)(temp++));

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
