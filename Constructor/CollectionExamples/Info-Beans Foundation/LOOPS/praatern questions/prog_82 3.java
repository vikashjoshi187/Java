import java.util.Scanner;
public class prog_82 {
    /*
      1
     12
    123
   1234
    123
     12
      1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente a number ");
        int num=sc.nextInt();
        
        for (int i = 1; i <= (num/2)+1; i++) {
            for (int sp = 1; sp < num-i; sp++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                
            }
            System.out.println();
             
            
        }
        for (int i = num/2; i >=1 ; i--) {
            for (int sp = 1; sp < num-i; sp++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                
            }
            System.out.println();
             
            
        }

    }
}
