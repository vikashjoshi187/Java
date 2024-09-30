import java.util.Scanner;
public class prog_47 {
    //WAP to print tables of all the numbers between two entered numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int num1,num2;
      System.out.println("enter number 1");
      num1=sc.nextInt();
      System.out.println("enter number 2");
      num2=sc.nextInt();

      for (int i = num1; i <= num2; i++) {
        for (int j = 1; j <= 10; j++) {

            System.out.println(i+" x "+j+" = "+(i*j));
            
        }
        System.out.println("\n\n");
        
      }

      
        
    }
}
