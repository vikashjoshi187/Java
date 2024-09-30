import java.util.Scanner;
public class prog_54 {
    /*
    A
   AB
  A_C
 A__D
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

                if(j==1|| i==num || j==i)
                {
                    System.out.print((char)(temp));
                }
                else{
                    System.out.print("_");
                }
                temp++;

                }
                else{
                    System.out.print(" ");
                }
              
            }
            System.out.println();
        }
    }
    
}
