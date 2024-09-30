import java.util.Scanner;
public class prog_50 {
    /*
    1
   22
  333
 4444
55555
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for (int i = 1; i <=num; i++) {

            for (int j = num; j >=1; j--) {
              
              if (i>=j) {
                System.out.print(i);

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
