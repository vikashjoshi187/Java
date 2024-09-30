import java.util.Scanner;
public class prog_49 {
    /*
     1
    12
   123
  1234
 12345
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for (int i = 1; i <=num; i++) {
            int temp=1;
            for (int j = num; j >=1; j--) {
              
              if (i>=j) {
                System.out.print(temp++);

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
