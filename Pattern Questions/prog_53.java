import java.util.Scanner;
public class prog_53 {
    /*
    1
   11
  1*1
 1**1
11111
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
                    System.out.print(1);
                }
                else{
                    System.out.print("*");
                }

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
